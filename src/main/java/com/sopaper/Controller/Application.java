package com.sopaper.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 管仲（胡军 hujun@tuya.com）
 * @Date 2020/9/25 9:57 上午
 * @Version 1.0
 */

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home(){
        return "springboot demo running in docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
