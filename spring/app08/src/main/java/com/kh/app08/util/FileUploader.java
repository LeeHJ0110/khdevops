package com.kh.app08.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUploader {

    public static String saveFile(MultipartFile f, String dirName) throws IOException {
        String originalFileName = f.getOriginalFilename();
        String filePath = "D:\\devs\\uploads\\" + dirName + "\\";
        String randomName = System.currentTimeMillis() + "_" + UUID.randomUUID();
        String ext = originalFileName.substring(originalFileName.lastIndexOf("."));
        String fileName = filePath + randomName + ext;
        File targetFile = new File(fileName);
        f.transferTo(targetFile);

        return fileName.replace("D:\\devs\\uploads\\" , "");
    }
}
