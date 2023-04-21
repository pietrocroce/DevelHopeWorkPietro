package JavaBasic_exercise.JavaBasic_6;

public class Main {
   public static void main(String[] args) {
      exercise1();
      exercise2();
      exercise3();
      exercise4Bonus();
   }

   /**
    * 1: Create a double variable called value, create another double variable called valueSquareRoot
    *
    *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
    */
   private static void exercise1() {
      System.out.println("Exercise 1:");
      // Write your code here
      double value = 9;
      double valueSquareRoot = Math.sqrt(value);
      System.out.println(valueSquareRoot);
   }

   /**
    * 2: See the code below
    *
    *    Print out the highest value using Math.max()
    *
    *    Then print out the lowest value using Math.min()
    *
    *    You must put your variables into these methods and separate them with a comma
    */
   private static void exercise2() {
      System.out.println("\nExercise 2:");
      int valueA = 5;
      int valueB = 10;
      int higherValue = Math.max(valueA,valueB);
      int lowerValue = Math.min(valueA,valueB);
      System.out.println("Max=" + higherValue);
      System.out.println("Min=" + lowerValue);

      // Write your code here
   }

   /**
    * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
    */
   private static void exercise3() {
      System.out.println("\nExercise 3:");

      int totalMoney = 50;
      int costPerBurger = 9;
      // Write your code here
      double Moneyremain = totalMoney % costPerBurger;
      System.out.println("Remainder=" + Moneyremain);
   }

   /**
    * 4: BONUS! This is an optional task, but it is recommended you complete it
    * ----------------------------------------------------------------------
    * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
    *
    * You do not need to write any code
    *
    * Answers can be found in resources
    */
   private static void exercise4Bonus() {
      System.out.println("\nExercise 4 (Bonus!):");

      double ourValue = 4.5;
      // Restituisce il valore double più piccolo che è maggiore o uguale all'argomento ed è uguale ad un numero
      //intero matematico
      System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
      // Restituisce il valore double più grande che è minore o uguale all'argomento ed è uguale ad un numero
      //intero matematico
      System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
      // Restituisce il long più vicino con arrotondamenti all'infinito positivo
      System.out.println(ourValue + " after using round=" + Math.round(ourValue));
      // Ritorna il valore del primo argomento elevato alla seconda
      System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
      // Ritorna il valore del primo argomento elevato al cubo
      System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
      // Restituisce un valore double con segno positivo, maggiore o uguale 0.0 e minore di 4.5.
      //I valori restituiti sono scelti a caso.
      System.out.println(ourValue + " times random =" + Math.random() * ourValue);
   }
   }