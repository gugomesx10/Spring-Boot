package com.br.estudo.learnspringframework.rest.webservice.restfullwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Pedro Oliveria");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecVersionOfPerson(){
        return new PersonV2(new Name("Pedro", "Oliveira"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Pedro Oliveria");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecVersionOfPersonRequestParameter(){
        return new PersonV2(new Name("Pedro", "Oliveira"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Pedro Oliveria");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Pedro", "Oliveira"));
    }

}
