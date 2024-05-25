package springAnotationXml2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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