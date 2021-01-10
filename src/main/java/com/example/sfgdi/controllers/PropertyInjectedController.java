package com.example.sfgdi.controllers;/* created by akshaypaswan on 10/01/21 */

import com.example.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
