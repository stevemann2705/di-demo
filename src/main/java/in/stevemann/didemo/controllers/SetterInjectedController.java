package in.stevemann.didemo.controllers;

import in.stevemann.didemo.services.GreetingService;
import in.stevemann.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
