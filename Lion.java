public class Lion extends Animal {

    // Create a static int that keep track of the number of hyenas created.

    static int numOfLion = 0;


    // Create a constructor.

    public Lion(){
        super();
        numOfLion++;
    }

    // Constructor for Tiger
    public Lion(String sex, int age, int weight, String animalID, String animalName,
                 String animalBirthdate, String animalColor, String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalID, animalName, animalBirthdate, animalColor, animalOrigin, animalArrivalDate);
            numOfLion++;
    }


}

