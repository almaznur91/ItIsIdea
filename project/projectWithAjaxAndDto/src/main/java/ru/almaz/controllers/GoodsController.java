package ru.almaz.controllers;

import com.google.common.annotations.GwtCompatible;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.almaz.dto.GoodsDto;
import ru.almaz.forms.AddGoodsForm;
import ru.almaz.forms.UpdateGoodsForm;
import ru.almaz.models.*;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.security.details.UserDetailsImpl;
import ru.almaz.service.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private AddGoodsService addGoodsService;
    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private FilesStorageService filesStorageService;




    @GetMapping("/goods/delete")
    public String deleteGoods(@RequestParam(value = "id", required = false) Long id,Authentication authentication) {
        goodsService.setStatusByGoods(id, GoodsStatus.NOT_CONFIRMED,authentication);
        return "redirect:/goods";
    }

    @GetMapping("/goods/publish")
    public String publishGoods(@RequestParam(value = "id", required = false) Long id, Authentication authentication) {
        goodsService.setStatusByGoods(id, GoodsStatus.CONFIRMED, authentication);
        return "redirect:/goods";
    }

    @GetMapping("/goods/updateGoods")
    public String showGoods(@RequestParam(value = "id", required = false) Long id, ModelMap model){

        Goods goods = goodsRepository.findOne(id);
        model.addAttribute("goods", goods);
        model.addAttribute("id",id);
        return "goods_page_dto";

    }

    @GetMapping("/goods")
    public String getGoodsPage(@ModelAttribute("model") ModelMap model,Authentication authentication) {

        if (userService.isUserByModerator(authentication) || userService.isUserbyAdmin(authentication)) {
            List<GoodsDto> goodsDtos;
            model.addAttribute("goods", goodsRepository.findAll());
            return "goods_page_for_moderator";
        } else {
            model.addAttribute("goods", goodsRepository.findAllByConfimed());

            model.addAttribute("sum",goodsService.getAllPriceInBasket());
        }

        return "goods_page";
    }

    @PostMapping("/goods/photo")
    @ResponseBody
    public String handlePhotoUpload(@RequestParam("file")MultipartFile file,
                                    @RequestParam(value = "id",required = false) Long id) {
        return filesStorageService.saveImageByPhoto(file,id);
    }


    @GetMapping("/addGoods")
    public String getSignUpPage() {
        return "/add_goods";
    }

    @PostMapping("/addGoods")
    @ResponseBody
    public void addGoods(@ModelAttribute AddGoodsForm form,Authentication authentication) {
        if (userService.isUserbyAdmin(authentication) || userService.isUserByModerator(authentication)) {
            addGoodsService.addGoods(form);
        }
    }

    @PostMapping(value = "/goods/update")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void updateGoods(UpdateGoodsForm form) {
        goodsService.updateGoods(form);
    }
    @GetMapping("/goods/oneGoods")
    public String showOneGoods(@RequestParam(value = "id", required = false) Long id,
                               ModelMap model){

        Goods goods = goodsRepository.findOne(id);
        model.addAttribute("goods", goods);
        return "one_goods_page";

    }


}
