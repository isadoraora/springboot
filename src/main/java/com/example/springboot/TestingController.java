package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//means it's ready to use MVC
public class TestingController {

    @RequestMapping("/")
    //maps to the index, in this case the default page
    public String index() {
        return "Testando Spring";
    }


}
