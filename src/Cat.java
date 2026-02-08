public class Cat extends Pet {

    public Cat(int id, String name, int age, boolean adopted) {
        super(id, name, age, adopted);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}

