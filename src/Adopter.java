public class Adopter {

    private int id;
    private String name;

    public Adopter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method: adopt a pet
    public void adopt(Pet pet) {
        if (pet.isAdopted()) {
            System.out.println(name + " cannot adopt " + pet.getName() + " (already adopted)");
        } else {
            pet.setAdopted(true);
            System.out.println(name + " adopted " + pet.getName());
        }
    }
}

