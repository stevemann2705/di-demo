package in.stevemann.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO = "Hello World!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
