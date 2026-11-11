package com.miso.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // what the past must be to run that given function
    @GetMapping(path = "/hello")
    public String helloworld(){
        return "Hello World";
    }
}
