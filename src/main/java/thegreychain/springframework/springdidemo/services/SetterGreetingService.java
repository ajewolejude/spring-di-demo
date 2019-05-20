package thegreychain.springframework.springdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO = "Hello, i was injected by a setter";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
