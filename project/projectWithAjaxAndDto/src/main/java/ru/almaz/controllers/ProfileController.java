package ru.almaz.controllers;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.almaz.dto.UserDto;
import ru.almaz.forms.UpdateUserForm;
import ru.almaz.models.Role;
import ru.almaz.models.User;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.UserRepository;
import ru.almaz.security.details.UserDetailsImpl;
import ru.almaz.service.FilesStorageService;
import ru.almaz.service.GoodsService;
import ru.almaz.service.ProfileService;
import ru.almaz.service.UserServiceImpl;

@Controller
public class ProfileController {


    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ProfileService profileService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public  String main(){
        return "redirect:profile";
    }

    @GetMapping("/profile")
    public String getProfilePage(ModelMap model, Authentication authentication) {
        if (userService.isUserbyAdmin(authentication) || userService.isUserByModerator(authentication)) {
            model.addAttribute("userAdmin", profileService.getUserInformationComplete(authentication));
            return "profile_for_moderator";
        } else {
            model.addAttribute("user", profileService.getUserInformationInComplete(authentication));
            model.addAttribute("sum", goodsService.getAllPriceInBasket());

            return "profile";
        }

    }


    @GetMapping("/profile/goods")
    public String getGoodsPageProfile(@ModelAttribute("model") ModelMap model,
                                      Authentication authentication) {

        if (userService.isUserByModerator(authentication) || userService.isUserbyAdmin(authentication)) {
            model.addAttribute("goods", goodsRepository.findAll());
            return "goods_page_for_moderator";
        } else {
            model.addAttribute("goods", goodsRepository.findAllByConfimed());
            model.addAttribute("sum",goodsService.getAllPriceInBasket());

            return "goods_page";
        }
    }

    @PostMapping(value = "/profile/update")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void updateProfile(Authentication authentication, UpdateUserForm form) {
        profileService.updateProfile(authentication, form);
    }

    @PostMapping("/avatar")
    @ResponseBody
    public String handleAvatarUpload(@RequestParam("file") MultipartFile file, Authentication authentication) {
        return filesStorageService.saveImageByAvatar(file, authentication);
    }


}