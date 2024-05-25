package springJavaCode2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Car{engine=Engine{starter=Starter{code='STARTER2'}}, spark=Spark{hinge=Hinge{code='HINGE2'}}}
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("MyConfiguration.class");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("springJavaCode2");
        Car car = context.getBean(Car.class);
//        Car car = (Car) context.getBean(Car.class);
        System.out.println(car);
        context.close();

    }

}
