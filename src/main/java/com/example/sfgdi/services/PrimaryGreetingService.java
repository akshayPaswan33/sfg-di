package com.example.sfgdi.services;/* created by akshaypaswan on 10/01/21 */

public class PrimaryGreetingService implements GreetingService{

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
