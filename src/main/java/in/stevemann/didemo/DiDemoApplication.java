package in.stevemann.didemo;

import in.stevemann.didemo.controllers.ConstructorInjectedController;
import in.stevemann.didemo.controllers.MyController;
import in.stevemann.didemo.controllers.PropertyInjectedController;
import in.stevemann.didemo.controllers.SetterInjectedController;
import in.stevemann.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
    }

}

