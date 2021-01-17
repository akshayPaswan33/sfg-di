package com.example.sfgdi.controllers;/* created by akshaypaswan on 10/01/21 */

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //@Autowired annotation on constructor is optional
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}