package springAnotationXml2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hinge {
//    @Value("higne1")
//@Value("${hinge.code}")
    private String code;

//    public Hinge(String code) {
//        this.code = code;
//    }

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