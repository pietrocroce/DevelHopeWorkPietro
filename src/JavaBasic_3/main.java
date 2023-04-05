package JavaBasic_3;

public class main {
    public static void main(String[] args) {
    exerciseone();
    exercisetwo();
    exercisethree();
}
   private static void exerciseone(){

    System.out.println("P C");
}
    private static void exercisetwo() {
        System.out.println(32);
        System.out.println("hasHadMyLunchToday = TRUE");
        System.out.println(4.99);
    }
    private static void exercisethree() {
        char FirstLetter = 'P';
        char SecondLetter = 'C';
        System.out.print(FirstLetter);
        System.out.println(SecondLetter);
        int MyAge = 32;
        System.out.println(MyAge);
        boolean hasHadMyLunchToday = false;
        System.out.println(hasHadMyLunchToday);
        double LunchPrice = 4.99;
        System.out.println(LunchPrice);
    }
}