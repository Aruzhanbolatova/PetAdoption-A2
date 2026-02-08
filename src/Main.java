


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1) DATA POOL (list of pets)
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog(1, "Buddy", 3, false));
        pets.add(new Cat(2, "Milo", 2, false));
        pets.add(new Dog(3, "Rex", 5, true));
        pets.add(new Cat(4, "Luna", 1, false));

        System.out.println("=== ALL PETS ===");
        for (Pet pet : pets) {
            System.out.println(pet); // toString()
        }

        // 2) SEARCH (find by name)
        System.out.println("\n=== SEARCH: name = Milo ===");
        Pet found = findByName(pets, "Milo");
        System.out.println(found != null ? found : "Not found");

        // 3) FILTER (only not adopted)
        System.out.println("\n=== FILTER: NOT ADOPTED ===");
        List<Pet> available = filterNotAdopted(pets);
        for (Pet pet : available) {
            System.out.println(pet);
        }

        // 4) SORT (by age)
        System.out.println("\n=== SORT: BY AGE (ASC) ===");
        pets.sort(Comparator.comparingInt(Pet::getAge));
        for (Pet pet : pets) {
            System.out.println(pet);
        }

        // 5) Adoption demo
        System.out.println("\n=== ADOPTION ===");
        Adopter adopter = new Adopter(1, "Alice");
        adopter.adopt(pets.get(0)); // Buddy
        adopter.adopt(pets.get(2)); // Rex already adopted

        // 6) equals + hashCode demo (compare objects)
        System.out.println("\n=== EQUALS DEMO ===");
        Pet p1 = new Dog(10, "Rocky", 4, false);
        Pet p2 = new Cat(10, "DifferentName", 7, true); // same id => equals true
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
    }

    // SEARCH
    public static Pet findByName(List<Pet> pets, String name) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    // FILTER
    public static List<Pet> filterNotAdopted(List<Pet> pets) {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (!pet.isAdopted()) {
                result.add(pet);
            }
        }
        return result;
    }
}

