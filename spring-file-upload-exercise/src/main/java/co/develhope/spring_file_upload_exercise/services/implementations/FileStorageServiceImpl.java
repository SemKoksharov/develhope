package co.develhope.spring_file_upload_exercise.services.implementations;

import co.develhope.spring_file_upload_exercise.services.interfaces.FileStorageService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    @Value("${fileRepo}")
    private String fileRepo;

    @Override
    public String uploadFile(MultipartFile file) throws IOException {

        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        String newFileName = "upl_" + LocalDate.now() + "_" + UUID.randomUUID();
        String completeFileName = newFileName + "." + extension;
        File finalFolder = new File(fileRepo);

        if (!finalFolder.isDirectory()) throw new IOException("[Input/Output error] Final folder is not a directory!");
        if (!finalFolder.exists()) throw new IOException("[Input/Output error] Final folder does not exists");

        File finalDestination = new File(fileRepo, completeFileName);
        if (finalDestination.exists())
            throw new IOException("[Input/Output error] File with name '" + completeFileName + "' already exists!");

        file.transferTo(finalDestination);

        return "File uploaded successfully: " + completeFileName;
    }

    @Override
    public byte[] downloadFile(String fileName) throws IOException {

        String filePath = fileRepo + "/" + fileName;
        File toDownload = new File(filePath);

        if (!toDownload.exists()) throw new IOException("File " + fileName + " not exist");

        return IOUtils.toByteArray(new FileInputStream(toDownload));
    }

    @Override
    public void removeFile(String fileName) throws IOException {

        String filePath = fileRepo + "/" + fileName;
        File toDelete = new File(filePath);

        boolean deleted = toDelete.delete();

        if (! deleted) throw new IOException("Delete file error!");
    }
}
