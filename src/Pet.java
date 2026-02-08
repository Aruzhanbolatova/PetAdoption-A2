

import java.util.Objects;

public abstract class Pet {

    private int id;
    private String name;
    private int age;
    private boolean adopted;

    // Constructor
    public Pet(int id, String name, int age, boolean adopted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adopted = adopted;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return adopted;
    }

    // Setter
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    // Abstract method (POLYMORPHISM)
    public abstract String getType();

    // toString
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adopted=" + adopted +
                ", type=" + getType() +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return id == pet.id;
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

