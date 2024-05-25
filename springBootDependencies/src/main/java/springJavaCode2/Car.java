package springJavaCode2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
    private Engine engine;
    private Spark spark;

    @Autowired
    public Car(Engine engine, Spark spark) {

        this.engine = engine;
        this.spark = spark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", spark=" + spark +
                '}';
    }
}