package springAnotationXml2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Starter {
//    @Value("starter1")
//    @Value("${starter.code}")
    private String code;

//    public Starter(String code) {
//        this.code = code;
//
//    }


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
