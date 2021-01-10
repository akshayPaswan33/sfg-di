package com.example.sfgdi.services;/* created by akshaypaswan on 10/01/21 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - Primary";
    }
}
