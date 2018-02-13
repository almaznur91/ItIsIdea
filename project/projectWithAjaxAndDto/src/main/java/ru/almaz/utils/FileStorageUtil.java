package ru.almaz.utils;


import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import ru.almaz.models.FileInfo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Component
public class FileStorageUtil {
    @Value("${storage.path}")
    private String storagePath;

    @SneakyThrows
    public void copyToStorage(MultipartFile file, String storageFileName){
        Files.copy(file.getInputStream(), Paths.get(storagePath,storageFileName));
    }

    public FileInfo convertFromToMultiPart(MultipartFile file){
        String storageName= createStorageName(file.getOriginalFilename());
        String fileUrl = getFileUrl(storageName);

        FileInfo fileInfo= FileInfo.builder()
                .originalFileName(file.getOriginalFilename())
                .size(file.getSize())
                .type(file.getContentType())
                .storageFileName(storageName)
                .url(fileUrl)
                .build();

        return fileInfo;
    }

    private String getFileUrl(String storageFileName) {
        return storagePath + "/" + storageFileName;

    }

    private String createStorageName(String originalNAme) {
        String extension = FilenameUtils.getExtension(originalNAme);
        String newFileName = UUID.randomUUID().toString().replace("-", "");
        return newFileName + "." + extension;

    }

}
