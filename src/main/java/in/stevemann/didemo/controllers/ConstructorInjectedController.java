package in.stevemann.didemo.controllers;

import in.stevemann.didemo.services.GreetingService;
import in.stevemann.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
