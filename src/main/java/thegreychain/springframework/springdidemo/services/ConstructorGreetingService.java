package thegreychain.springframework.springdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO = "Hello, i was injected by a constructor";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
