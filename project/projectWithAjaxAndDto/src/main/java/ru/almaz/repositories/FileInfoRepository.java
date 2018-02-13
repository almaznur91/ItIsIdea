package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almaz.models.FileInfo;

public interface FileInfoRepository extends JpaRepository<FileInfo,Long> {
    FileInfo findOneByStorageFileName(String fileName);
}
