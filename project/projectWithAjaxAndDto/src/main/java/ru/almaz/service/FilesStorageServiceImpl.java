package ru.almaz.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.almaz.models.FileInfo;
import ru.almaz.models.Goods;
import ru.almaz.models.User;
import ru.almaz.repositories.FileInfoRepository;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.UserRepository;
import ru.almaz.utils.FileStorageUtil;
import ru.almaz.utils.ImagesFilesValidator;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Service

public class FilesStorageServiceImpl implements FilesStorageService {

    @Autowired
    private FileStorageUtil fileStorageUtil;
    @Autowired
    private FileInfoRepository fileInfoRepository;
    @Autowired
    private ImagesFilesValidator imagesFilesValidator;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GoodsRepository goodsRepository;


    @Override
    public String saveFile(MultipartFile file) {

        FileInfo  fileInfo = fileStorageUtil.convertFromToMultiPart(file);
        fileInfoRepository.save(fileInfo);
        fileStorageUtil.copyToStorage(file,fileInfo.getStorageFileName());

        return fileInfo.getStorageFileName();
    }

    @Override
    @SneakyThrows
    public void writeFileToResponse(String fileName, HttpServletResponse response) {
        FileInfo fileInfo = fileInfoRepository.findOneByStorageFileName(fileName);
        response.setContentType(fileInfo.getType());
        InputStream inputStream = new FileInputStream(new File(fileInfo.getUrl()));
        IOUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();
    }

    @Override
    public String saveImage(MultipartFile file) {
        imagesFilesValidator.validate(file);
        return saveFile(file);
    }

    @Override
    public String saveImageByAvatar(MultipartFile file, Authentication authentication) {

            // проверяем файл на валидность - картинка или нет
            imagesFilesValidator.validate(file);
            // создаем модель на основе мультипарта
            FileInfo fileInfo = fileStorageUtil.convertFromToMultiPart(file);
            // сохраняем в бд информацию о файле
            fileInfoRepository.save(fileInfo);
            // копируем файл на диск
            fileStorageUtil.copyToStorage(file, fileInfo.getStorageFileName());
            // находим текущего пользователя по авторизации
            User user = userRepository.findByUserLogin(authentication.getName()).orElseThrow(IllegalArgumentException::new);
            user.setImage(fileInfo);
            fileInfoRepository.save(user.getImage());
            userRepository.save(user);
            return fileInfo.getStorageFileName();

    }

    @Override
    public String saveImageByPhoto(MultipartFile file, Long id) {

        imagesFilesValidator.validate(file);
        FileInfo fileInfo = fileStorageUtil.convertFromToMultiPart(file);
        fileInfoRepository.save(fileInfo);
        fileStorageUtil.copyToStorage(file, fileInfo.getStorageFileName());
        Goods goods = goodsRepository.findOne(id);
        goods.setImage(fileInfo);
        fileInfoRepository.save(goods.getImage());
        goodsRepository.save(goods);
        return fileInfo.getStorageFileName();

    }

    @Override
    public FileInfo saveGoodsPhoto(MultipartFile file) {
        imagesFilesValidator.validate(file);

        FileInfo  fileInfo = fileStorageUtil.convertFromToMultiPart(file);
        fileInfoRepository.save(fileInfo);
        fileStorageUtil.copyToStorage(file,fileInfo.getStorageFileName());
        return fileInfo;
    }

}
