package JavaBasic_5;

public class main {
    public static void main(String[] args) {
        exerciseone();
        exercisetwo();
        exercisethree();
        exerciseonebonus();
        exercisetwobonus();
    }
    private static void exerciseone(){
        int Number = 5;
        int SumOfNumber = Number + 1;
        int ResultWithMinus = Number - 1;
        System.out.println(" The total of numbers is "+ SumOfNumber);
        System.out.println("The result minus 1 is "+ ResultWithMinus);
       }
    private static void exercisetwo(){
        int Redpens = 6;
        int Blupens = 3;
        int DivisionOfPens = Redpens / Blupens;
        int MultiplicationOfPens = Redpens * Blupens;
        System.out.println("The division is =" + DivisionOfPens);
        System.out.println(" The moltiplication is "+ MultiplicationOfPens);
        }
    private static void exercisethree(){
        int CelsiusOne = 20;
        int Celsiustwo = 28;
        double FahrenheitOne = CelsiusOne * 1.8 + 32;
        double FahrenheitTwo = Celsiustwo * 1.8 + 32;
       System.out.println(CelsiusOne + FahrenheitOne);
        System.out.println(Celsiustwo + FahrenheitTwo);
       }
        //oppure
        //    private static void exercisethree(){
        //          int Celsius = 20;
        //      double Fahrenheit = Celsius * 1.8 + 32;      da errore perchè la variabile Celsius è già stata usata
        //     System.out.println(Celsius + Fahrenheit);      come fare ???
        //    int Celsius = 28;
        //    System.out.println(Celsius + Fahrenheit );
        //}
    private static void exerciseonebonus(){
        int Age = 10;
        var IncreaseAge = Age +=5;
        System.out.println(IncreaseAge);
    }
    private static void exercisetwobonus(){
    int Age = 50;
    int newAge = Age -= 50;
    int Agetwo = 52;
    int decreaseAge = Agetwo -=2;
    int decreaseAgainAge = decreaseAge-=50;
    System.out.println(newAge);
    System.out.print(decreaseAgainAge);
    }
}