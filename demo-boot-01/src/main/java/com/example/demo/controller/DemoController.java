package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${qianjinEnv1:}")
    private String qianjinEnv1;
    @Value("${qianjinEnv2:}")
    private String qianjinEnv2;

    @RequestMapping({"/", "/index"})
    public String myIndex() {
        /*System.out.println("qianjin1" + " ---> " + System.getProperty("qianjin1"));
        System.out.println("qianjin2" + " ---> " + System.getProperty("qianjin2"));*/
        System.out.println("========================");
        System.out.println("qianjinEnv1" + " ---> " + qianjinEnv1);
        System.out.println("qianjinEnv2" + " ---> " + qianjinEnv2);

        /*System.out.println("qianjinEnv1 by System.getProperty" + " ---> " + System.getProperty("qianjinEnv1"));*/
        System.out.println("envFromExtension2" + " ---> " + System.getenv("envFromExtension2"));
        System.out.println("qianjinEnv1 by System.getEnv" + " ---> " + System.getenv("qianjinEnv1"));
        return "Hello Spring Boot. ---- NEW ---one deploy 02 - slot";
    }

}
