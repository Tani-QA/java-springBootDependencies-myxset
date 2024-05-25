package main;

public class Spark {
    private Hinge hinge;
    public Spark(Hinge hinge) {
        this.hinge = hinge;
    }

    @Override
    public String toString() {
        return "Spark{" +
                "hinge=" + hinge +
                '}';
    }
}
