package com.example.sfgdi.services;/* created by akshaypaswan on 10/01/21 */

import org.springframework.stereotype.Service;

//@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - setter";
    }
}
