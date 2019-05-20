package thegreychain.springframework.springdidemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "How are you all?";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
