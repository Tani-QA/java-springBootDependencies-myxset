package springAutowired2;

import org.springframework.stereotype.Component;

@Component
public class Starter {
    private String code;

    public Starter() {
        this.code = "STARTER2";
    }

    @Override
    public String toString() {
        return "Starter{" +
                "code='" + code + '\'' +
                '}';
    }
}
