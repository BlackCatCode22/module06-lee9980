

public class Hyena extends Animal {
    // Create a constructor that will have all the fields I want.
    public Hyena(String sex, int age, int weight, String animalName,
                        String animalID, String animalBirthDate, String animalColor,
                        String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin, animalArrivalDate);

    }

        // Method to return the sound specific to Hyena
        public String makeSound() {
            return "laugh";

    }



}
