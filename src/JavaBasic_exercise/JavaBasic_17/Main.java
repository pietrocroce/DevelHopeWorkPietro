package JavaBasic_exercise.JavaBasic_17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        acceptfound();
    }
    public static void acceptfound(){
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
        System.out.println(questionableFundsEuro + myBankBalanceEuro);
        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age = short perchè nel caso la persona oltrepassa i 127 anni abbiamo un più efficiente sistema di
     *    immagazinamento dati rispetto al byte
     *    2b: The age of a baby in months = byte perchè i mesi arrivano al massimo a doppia cifra se uno usa tre cifre
     *    ha qualche problema mentale
     *    2c: Money in a hedgefund in euros = long perchè possono contenere centinaia di miliardi
     *    2d: Price of a good in euros on amazon.com = float perchè i beni su amazon avranno un prezzo contenuto nell'ordine
     *    di decine di migliaia
     *    2e: The exact weight of an apple measured by scientific equipment = double perchè potremmo avere
     *    numeri decimali infiniti
     *    2f: The number of kilometers from any 2 places in the world = int perchè tra float che limitato e long che
     *    è troppo, int è un buona via di mezzo per questa grandezza
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        myDate();
    }
    public static void myDate(){

        System.out.println(" In the day "+ LocalDate.now().getDayOfWeek()
       + " of "+LocalDate.now().getDayOfMonth()
       + " nel " + LocalDate.now().getDayOfYear()
       + " in the month " + LocalDate.now().getMonth()
       + " which would be " + LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().isBefore(LocalDate.of(1991,02,13)));
        System.out.println(LocalDate.now().isAfter(LocalDate.of(1991,02,13)));
    }
}

