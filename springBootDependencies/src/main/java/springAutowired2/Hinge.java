package springAutowired2;

import org.springframework.stereotype.Component;

@Component
public class Hinge {
    private String code;
    public Hinge() {
        this.code = "HINGE2";
    }

    @Override
    public String toString() {
        return "Hinge{" +
                "code='" + code + '\'' +
                '}';
    }
}