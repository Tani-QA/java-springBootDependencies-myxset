package springIntroduce2;

public class Engine {
    private Starter starter;

    public Engine(Starter starter) {
        this.starter = starter;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "starter=" + starter +
                '}';
    }
}