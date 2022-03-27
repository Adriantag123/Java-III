package temaC72;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
@Scope("prototype")
public class MyBeanPrototype {
    static int objectCounter = 0;
    public MyBeanPrototype() {
        objectCounter++;
        System.out.println("Current number of PROTOTYPE instances: " + objectCounter);
    }

    @PostConstruct
    private void performInitialization() {
        System.out.println("This PROTOTYPE method is called at initialization");
    }

    @PreDestroy
    private void performDestruction() {
        System.out.println("This PROTOTYPE method is called at destruction. Use this to free resources.");
    }
}