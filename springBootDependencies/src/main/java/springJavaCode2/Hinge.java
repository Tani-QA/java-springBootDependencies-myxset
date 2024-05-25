package springJavaCode2;

import org.springframework.stereotype.Component;

//@Component
public class Hinge {
    private String code;
    public Hinge(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Hinge{" +
                "code='" + code + '\'' +
                '}';
    }
}