package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Car{engine=Engine{starter=Starter{code='STARTER1'}}spark=Spark{hinge=Hinge{code='HINGE1'}}}
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

        Car car = new Car(new Engine(new Starter("STARTER1")), new Spark(new Hinge("HINGE1")));
        System.out.println(car);

    }

}
