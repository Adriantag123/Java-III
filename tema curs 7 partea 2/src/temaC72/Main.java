package temaC72;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String args[]) {
        // load the spring configuration file

        System.out.println("----- Before context initialization");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("----- Before getBean calls");

        context.getBean("myBean", MyBean.class);
        context.getBean("myBean", MyBean.class);
        context.getBean("myBean", MyBean.class);

        System.out.println("----- After getBean calls");
        System.out.println("Current number of instances: " + MyBean.objectCounter);

        context.getBean("myBeanPrototype", MyBeanPrototype.class);
        context.getBean("myBeanPrototype", MyBeanPrototype.class);
        context.getBean("myBeanPrototype", MyBeanPrototype.class);


        // close the context
        context.close();
        System.out.println("----- After context closed");




    }
}