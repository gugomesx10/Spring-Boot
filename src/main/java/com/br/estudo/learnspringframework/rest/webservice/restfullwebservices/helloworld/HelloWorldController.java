package com.br.estudo.learnspringframework.rest.webservice.restfullwebservices.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

// Rest API
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    // GET - Rtrieve details of a resource
    //"Hello World"
    @GetMapping (path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping (path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    // /users/{id}/todos/{id} => /users/1/todos/1
    // /hello-worl/path-variable/{name}

    @GetMapping (path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @GetMapping (path = "/hello-world-internationalized")
    public String helloWorldInternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
        //return "Hello World V2";

        //1: good.monirg.message=Good Morning
        //2:
    }

    // POST - Create a new resource

    // PUT - Update an existing resource

    // Patch - Update part of a resource

    // DELETE - Delete a resource
}
