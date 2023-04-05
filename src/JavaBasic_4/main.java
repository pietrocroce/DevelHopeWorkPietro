package JavaBasic_4;

public class main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int age = 32;
        System.out.println("My age = " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        int age = 32;
        char FirstLetterName = 'P';
        System.out.println("My age is " + age + " My initial Name is " + FirstLetterName);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        boolean hasEatenLunch = false;                //creazione di una variabile boolean con valore false
        double lunchCost = 5.99;                      //creazione di una variabile double con valori decimali

        System.out.println("Lunch cost=" + lunchCost); //stampa richiamando la variabile double
        System.out.println("Has Eaten lunch=" + hasEatenLunch); // stampa richiamando la variabile boolean
    }
}
