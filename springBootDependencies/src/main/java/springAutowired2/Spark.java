package springAutowired2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Spark {
    private Hinge hinge;

    @Autowired
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