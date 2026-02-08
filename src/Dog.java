

public class Dog extends Pet {

    public Dog(int id, String name, int age, boolean adopted) {
        super(id, name, age, adopted);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}

