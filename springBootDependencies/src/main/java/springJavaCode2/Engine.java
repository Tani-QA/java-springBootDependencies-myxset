package springJavaCode2;

//@Component
public class Engine {
    private Starter starter;

//    @Autowired
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