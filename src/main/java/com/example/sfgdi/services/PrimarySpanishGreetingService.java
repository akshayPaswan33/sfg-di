package com.example.sfgdi.services;/* created by akshaypaswan on 15/01/21 */


public class PrimarySpanishGreetingService implements GreetingService{

    private final GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
