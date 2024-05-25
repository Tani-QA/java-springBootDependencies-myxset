package springAutowired2;


import org.springframework.stereotype.Component;

@Component("car")
public class Car {
    private Engine engine;
    private Spark spark;

    public Car(Engine engine, Spark spark) {
        this.engine = engine;
        this.spark = spark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                "spark=" + spark +
                '}';
    }
}