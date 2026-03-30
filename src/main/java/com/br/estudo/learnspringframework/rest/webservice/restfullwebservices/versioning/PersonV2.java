package com.br.estudo.learnspringframework.rest.webservice.restfullwebservices.versioning;

public class PersonV2 {
    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name [name=" + name + "]";
    }
}
