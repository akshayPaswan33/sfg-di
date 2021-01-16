package com.example.sfgdi.controllers;/* created by akshaypaswan on 11/01/21 */

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class I18nController {
    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
