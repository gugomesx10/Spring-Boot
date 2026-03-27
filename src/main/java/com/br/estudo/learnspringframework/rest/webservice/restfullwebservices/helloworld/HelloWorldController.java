package com.br.estudo.learnspringframework.rest.webservice.restfullwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest API
@RestController
@RequestMapping("/api")
public class HelloWorldController {
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

    // POST - Create a new resource

    // PUT - Update an existing resource

    // Patch - Update part of a resource

    // DELETE - Delete a resource
}
