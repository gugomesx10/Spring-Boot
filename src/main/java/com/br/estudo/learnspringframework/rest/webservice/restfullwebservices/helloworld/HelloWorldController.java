package com.br.estudo.learnspringframework.rest.webservice.restfullwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest API
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    //"Hello World"
    @GetMapping (path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping (path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
}
