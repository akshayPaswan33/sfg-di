package com.example.sfgdi.services;/* created by akshaypaswan on 11/01/21 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("ES")
//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Mundo - ES";
    }
}
