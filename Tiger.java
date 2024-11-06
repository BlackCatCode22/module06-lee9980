public class Tiger extends Animal {

    // Creating myself a static int that keep track of the number of hyenas

    static int numOfTiger = 0;

    // Create myself a constructor

    public Tiger(){
        super();
        numOfTiger++;
    }





    // Constructor for Tiger
    public Tiger(String sex, int age, int weight, String animalID, String animalName,
                 String animalBirthdate, String animalColor, String animalOrigin,  String animalArrivalDate) {
        super(sex, age, weight, animalID, animalName, animalBirthdate, animalColor, animalOrigin,  animalArrivalDate);
            numOfTiger++;
    }

}

