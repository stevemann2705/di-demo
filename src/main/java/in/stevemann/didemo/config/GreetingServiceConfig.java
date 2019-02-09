package in.stevemann.didemo.config;

import in.stevemann.didemo.services.GreetingRepository;
import in.stevemann.didemo.services.GreetingService;
import in.stevemann.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Profile({"default","en"})
    @Primary
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("en");
    }

    @Bean
    @Profile("es")
    @Primary
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("es");
    }

    @Bean
    @Profile("de")
    @Primary
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("de");
    }
}
