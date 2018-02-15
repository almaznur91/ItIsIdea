package ru.almaz.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.almaz.models.FileInfo;

import javax.servlet.http.HttpServletResponse;



public interface FilesStorageService {
    String saveFile(MultipartFile file);

    void writeFileToResponse(String fileName, HttpServletResponse response);


    String saveImage(MultipartFile file);

    String saveImageByAvatar(MultipartFile file, Authentication authentication);

    String saveImageByPhoto(MultipartFile file, Long id);

    FileInfo saveGoodsPhoto(MultipartFile file);
}
