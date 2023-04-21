package JavaBasic_exercise.JavaBasic_3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        char name = 'P';
        char surname = 'C';
        System.out.print("P C"+"."+ name +"-"+ surname);
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        int age = 28;
        boolean hasHadMyLunchToday = true;
        double MylunchPrice = 4.99;
        System.out.println(28);
        System.out.println("true ");
        System.out.println(4.99);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        char FirstLetter = 'P';
        char SecondLetter = 'C';
        System.out.print("My name start with letter "+ FirstLetter);
        System.out.println("My surname start with letter "+ SecondLetter);
        int MyAge = 32;
        System.out.println("My age is " + MyAge);
        boolean hasHadMyLunchToday = false;
        System.out.println(" I have eaten today " + hasHadMyLunchToday);
        double LunchPrice = 4.99;
        System.out.println("My lunch cost " + LunchPrice);
    }
}