package com.kh.app07;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Controller
public class HomeController {

    @GetMapping("home")
    public void home(){}

    @PostMapping("test")
    public void test(MultipartFile f) throws IOException {
        String filePath = "D:\\devs\\uploads\\";
        String fileName = System.currentTimeMillis() + "_" + UUID.randomUUID();
        String ext = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."));
        File targetFile = new File(filePath + fileName + ext);
        f.transferTo(targetFile);
    }
}
