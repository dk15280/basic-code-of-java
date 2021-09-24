import com.company.Bird;


public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying in the sky ");
    }
}

