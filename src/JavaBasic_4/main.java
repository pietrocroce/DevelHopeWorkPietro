package JavaBasic_4;

public class main {
    public static void main(String[] args) {
        exerciseone();
        exercisetwo();
        exercisethree();
    }
    private static void exerciseone(){
    int age = 32;
    System.out.println("My age = " + age);
    }
    private static void exercisetwo(){
    int age = 32;
    char FirstLetterName = 'P';
    System.out.println("My age is "+ age + " My initial Name is "+ FirstLetterName);
    }
    private static void exercisethree(){
        //creo una variabile per sapere se è vero o no che ho mangiato
        boolean haseatenlunch = false;
        //variabile per conoscere il prezzo del pranzo
        double lunchcost = 4.99;
        //stampa del risultato se è vero che ho pranzato
        System.out.println("has eaten lunch "+ haseatenlunch);
        //stampa del risultato del costo del pranzo
        System.out.println("the cost of lunch = "+ lunchcost);
    }

}