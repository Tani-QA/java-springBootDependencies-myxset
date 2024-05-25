package main;

public class Car {
    private Engine engine;
    private Spark spark;

    public Car(Engine engine, Spark spark) {
        this.spark=spark;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                "spark=" + spark +
                '}';
    }

}
