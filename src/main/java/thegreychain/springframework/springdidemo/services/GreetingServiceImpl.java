package thegreychain.springframework.springdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "How are you all?";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
