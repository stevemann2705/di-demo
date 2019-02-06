package in.stevemann.didemo.services;

public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO = "Hello World!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
