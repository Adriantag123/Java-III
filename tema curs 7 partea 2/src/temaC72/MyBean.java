package temaC72;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
public class MyBean {
    static int objectCounter = 0;
    public MyBean() {
        objectCounter++;
        System.out.println("Current number of instances: " + objectCounter);
    }

    @PostConstruct
    private void performInitialization() {
        System.out.println("This method is called at initialization");
    }

    @PreDestroy
    private void performDestruction() {
        System.out.println("This method is called at destruction. Use this to free resources.");
    }
}