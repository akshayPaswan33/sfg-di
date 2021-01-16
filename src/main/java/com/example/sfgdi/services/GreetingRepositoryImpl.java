package com.example.sfgdi.services;/* created by akshaypaswan on 16/01/21 */

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGermanGreeting() {
        return "German";
    }

    @Override
    public String getEnglishGreeting() {
        return "English";
    }

    @Override
    public String getSpanishGreeting() {
        return "Spanish";
    }
}
