package tnSpringHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Run {
    public static void main(String[] args) {
        /*WorkerService workerService = new WorkerService();
        Worker worker = new Worker(1, "Sdasd", "sdas", "sadsad");
        workerService.save(worker);*/

       // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

       //Delivery good = context.getBean("Delivery", Delivery.class);

        SpringApplication.run(Run.class, args);

        /*ApplicationContext applicationContext = SpringApplication.run(Run.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        System.out.println(applicationContext.getBeanDefinitionCount());*/

        //ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        //((AnnotationConfigApplicationContext) context).refresh();
        //Delivery good = context.getBean("Delivery", Delivery.class);

    }
}
