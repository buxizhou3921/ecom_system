package com.ecom.controller;

import com.ecom.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * ClassName: UploadController
 * Package: com.ecom.controller
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-16 - 1:13
 * @ Version: v1.0
 */

@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public String upload(MultipartFile file) throws IOException {
        log.info("文件上传: {}", file);
        // 获取原始文件名
        String originalFilename = file.getOriginalFilename();

        // 构造唯一的文件名 - uuid
        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFilename = UUID.randomUUID().toString() + extname;
        log.info("新的文件名：{}", newFilename);

        // 文件存储
        file.transferTo(new File("D:\\java_learn\\ecom_system\\target\\classes\\static\\img\\good\\" + newFilename));
        return newFilename;
    }
}
