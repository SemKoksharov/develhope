package co.develhope.springinterceptors2;

import java.io.File;
import java.util.Objects;

public class SpringMVCProjectStructure {

    public static void main(String[] args) {

        String baseDir = "src/main/java";


        String targetDir = (findLastDirectory(new File(baseDir))).toString();

        if (targetDir != null) {
            System.out.println("Target directory: " + targetDir);


            createDir(targetDir, "config");
            createDir(targetDir, "controllers");
            createDir(targetDir, "dto/request");
            createDir(targetDir, "dto/response");
            createDir(targetDir, "repositories");
            createDir(targetDir, "services/implementations");
            createDir(targetDir, "services/interfaces");
            createDir(targetDir, "entities");
            createDir(targetDir, "models");
            createDir(targetDir, "interceptors");

            System.out.println("Spring MVC project structure created successfully.");
        } else {
            System.out.println("Target directory not found.");
        }
    }

    private static void createDir(String baseDir, String dirPath) {

        File dir = new File(baseDir, dirPath);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directory created: " + dir.getPath());
            } else {
                System.out.println("Failed to create directory: " + dir.getPath());
            }
        } else {
            System.out.println("Directory already exists: " + dir.getPath());
        }
    }

    private static File findLastDirectory(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    File deeperDir = findLastDirectory(file);
                    return Objects.requireNonNullElse(deeperDir, file);
                }
            }
        }
        return null;
    }
}


