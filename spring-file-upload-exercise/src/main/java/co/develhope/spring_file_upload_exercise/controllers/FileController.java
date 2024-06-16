package co.develhope.spring_file_upload_exercise.controllers;

import co.develhope.spring_file_upload_exercise.services.interfaces.FileStorageService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/api/upDown")
public class FileController {

    private final FileStorageService fileStorageService;

    @Autowired
    public FileController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping
    public List<String> uploadFiles(MultipartFile[] files) throws IOException {

        Set<MultipartFile> fileSet = new HashSet<>(Arrays.stream(files).toList());
        List<String> uploadedFilenamesList = new ArrayList<>();

        fileSet.forEach(file ->
                {
                    try {
                        uploadedFilenamesList.add(fileStorageService.uploadFile(file));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        return uploadedFilenamesList;
    }

    @GetMapping("/download")
    public @ResponseBody byte[] download(@RequestParam String filename, HttpServletResponse response) throws IOException {

        System.out.println("Downloading: " + filename);
        String extension = FilenameUtils.getExtension(filename).toLowerCase();

        switch (extension) {
            case "gif" -> response.setContentType(MediaType.IMAGE_GIF_VALUE);
            case "jpg", "jpeg" -> response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            case "png" -> response.setContentType(MediaType.IMAGE_PNG_VALUE);
            case "pdf" -> response.setContentType(MediaType.APPLICATION_PDF_VALUE);
            case "txt" -> response.setContentType(MediaType.TEXT_PLAIN_VALUE);
            case "html" -> response.setContentType(MediaType.TEXT_HTML_VALUE);
            //per elaborare correttamente download di tutti tipi di file
            default -> response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);

        }
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
        return fileStorageService.downloadFile(filename);

    }
}
