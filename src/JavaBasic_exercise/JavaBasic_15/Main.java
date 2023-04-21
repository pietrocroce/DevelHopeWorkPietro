package JavaBasic_exercise.JavaBasic_15;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        // esercizio 1a
        while (currentInvestmentValueEuros <= 100000) {

        //esercizio 1b  while (yearsPast <= 5 || currentInvestmentValueEuros <= 15000)
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        while (remainingPoundsToSell > 0){
           poundToEuroExchangeRate =  1 + (Math.random() * 0.2);
            if(poundToEuroExchangeRate >= 1.15){
                remainingPoundsToSell -= Math.min(maxPoundsToSellPerDay, remainingPoundsToSell);
            }
            daysToSell++;
        }

        System.out.println("It took " + daysToSell + " to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1:We should use a do while loop, as we will always want to check at least 1 user action. And we do not know how many actions the user will take
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2:We should use a for each, or for i loop. We have a determinate number of emails to send. For each would be simpler
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: We would want to use a for i loop, going from index 0 to 79 to process the 80 items. If there are more items here, a for each would process them too.
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: We would want to use a while loop, as we only want to read the file if there are lines, but as we are not reading the full file at once. We do not know how many lines there are, so a for is inappropriate
     */
}