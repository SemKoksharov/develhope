package co.develhope.spring_file_upload_exercise.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileStorageService {

    String uploadFile(MultipartFile file) throws IOException;

    byte[] downloadFile(String filePath) throws IOException;

    void removeFile(String filepath) throws IOException;
}
