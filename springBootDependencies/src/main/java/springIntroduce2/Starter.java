package springIntroduce2;

public class Starter {
    private String code;
    public Starter(String code) {
        this.code = code;
    }

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
