package ru.almaz.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.almaz.service.FilesStorageService;
import ru.almaz.service.FilesStorageServiceImpl;

import javax.servlet.http.HttpServletResponse;

@Controller
public class FileStorageController {

    @Autowired
    private FilesStorageService filesStorageService;

    @PostMapping("/files")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file")MultipartFile file){
        return filesStorageService.saveFile(file);
    }

    @PostMapping("/image")
    @ResponseBody
    public String handleImageUpload(@RequestParam("file")MultipartFile file){
        return filesStorageService.saveImage(file);

    }


    @GetMapping(value = "/files/{file-name:.+}")
    public void getFiles(@PathVariable ("file-name") String fileName,
                         HttpServletResponse response){
        filesStorageService.writeFileToResponse(fileName, response);
    }

}
