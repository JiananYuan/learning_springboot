package com.example.learnspb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.MultipartConfigElement;


@SpringBootApplication
public class LearnspbApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnspbApplication.class, args);
    }

    @Bean
    public MultipartConfigElement multipartConfigFactory() {
        MultipartConfigFactory configFactory = new MultipartConfigFactory();
        configFactory.setMaxFileSize(DataSize.parse("128MB"));
        configFactory.setMaxRequestSize(DataSize.parse("1024MB"));
        configFactory.setLocation("/files");
        return configFactory.createMultipartConfig();
    }

}
