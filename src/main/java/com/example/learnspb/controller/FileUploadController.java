package com.example.learnspb.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {

    private Logger logger = LogManager.getLogger("llog");

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String file() {
        logger.info("跳转文件上传控制器");
        return "file";
    }

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        BufferedOutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream(new File(file.getOriginalFilename())));
        logger.info("文件名称：" + file.getOriginalFilename());
        outputStream.write(file.getBytes());
        outputStream.flush();
        outputStream.close();
        return "文件上传成功";
    }

}
