package com.example.springboot.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class groovy {

    @RestController
    class ThisWillActuallyRun {

        @RequestMapping("/")
        String home(){
            final String s = "Olá, pessoal!";
            return s;
        }
    }
}
