package JavBasic_OOP_3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student nuovoStudente = new Student();
        nuovoStudente.setstudentName("Pietro");
        nuovoStudente.setstudentSurname("Croce");
        nuovoStudente.setstudentAge(36);
        nuovoStudente.setoriginCity("Ischia");

        System.out.println(nuovoStudente.getstudentName());
        System.out.println(nuovoStudente.getstudentSurname());
        System.out.println(nuovoStudente.getstudentAge());
        System.out.println(nuovoStudente.getoriginCity());
        System.out.println(nuovoStudente.getIsmaggiorenne());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student newstudent = new Student();

    newstudent.setstudentName("Francesco");
    newstudent.setstudentAge(12);
    newstudent.setLimitforstudenttoaccesstothecourse(10);
    newstudent.setCounterforeverynewstudent(12);
        System.out.println(newstudent.getstudentName()+" "+ newstudent.getIsmaggiorenne()+ " "+ newstudent.getCounterforeverynewstudent());

    }

}