public class Bear extends Animal {

    // Create a static int that keep track of the number of hyenas created.

    static int numOfBear = 0;

    // Create a constructor.

    public Bear(){
        super();
        numOfBear++;
    }

    // Create a constructor.
    public Bear(String sex, int age, int weight, String animalID, String animalName,
                String animalBirthdate, String animalColor, String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalID, animalName, animalBirthdate, animalColor, animalOrigin,  animalArrivalDate);
            numOfBear++;
    }

}


