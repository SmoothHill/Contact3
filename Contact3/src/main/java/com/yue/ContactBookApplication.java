package com.yue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

// 在您的配置类或主应用类中添加
@CrossOrigin(origins = "http://localhost:3000") // 允许来自前端开发服务器的跨域请求
@SpringBootApplication
public class ContactBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContactBookApplication.class, args);
    }
}
