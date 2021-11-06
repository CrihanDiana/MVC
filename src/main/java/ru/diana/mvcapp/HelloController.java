package ru.diana.mvcapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }
    @GetMapping("/hello-world2")
    public String sayHello2(){
        return "hello_World";
    }
}
