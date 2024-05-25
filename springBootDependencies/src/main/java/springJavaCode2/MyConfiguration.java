package springJavaCode2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springJavaCode2")
public class MyConfiguration {

    @Bean
    public Car car(){
        return new Car(engine(), spark());
    }

    @Bean
    public Engine engine() {
        return new Engine(starter());
    }

    @Bean
    public Spark spark() {
        return new Spark(hinge());
    }

    @Bean
    public Starter starter() {
        return new Starter("STARTER2");
    }


    @Bean
    public Hinge hinge() {
        return new Hinge("HINGE2");
    }
}
