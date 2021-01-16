package com.example.sfgdi.services;/* created by akshaypaswan on 10/01/21 */

import org.springframework.stereotype.Service;

//@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - Property";
    }
}
