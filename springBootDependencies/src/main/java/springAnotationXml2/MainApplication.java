package springAnotationXml2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Car{engine=Engine{starter=Starter{code='STARTER2'}}spark=Spark{hinge=Hinge{code='HINGE2'}}}
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnotation2.xml");

        Car car = (Car)context.getBean("car");
        System.out.println(car);
        context.close();

    }

}
