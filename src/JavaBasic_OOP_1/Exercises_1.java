package JavaBasic_OOP_1;

import java.util.Arrays;
import java.util.List;

public class Exercises_1 {
    public static void main(String[] args) {
        Course studentcourse = new Course();
        printMyTwoVariables(studentcourse);
        exercise2();
        exercise3();
    }

    static void printMyTwoVariables(Course course) {
        System.out.println(" My course is called " + course.courseName + " and i have found at maximum " + course.maxStudents);

    }


    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     * (class variables are called 'fields' or 'attributes')
     * called 'name' and 'age'
     * <p>
     * Using the function below set the student name and ages
     */
    private static void exercise2() {
        //l'esercizio risulta un po diverso perchè ho provato a giocare un pò
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        //Student pocafantasia = new Student();

        //metodo senza ciclo
       // System.out.println("il nome dello studente è " + studentNames.get(0) + " con età di " + studentAges.get(0) + " anni");
       // printNameAndAge(pocafantasia);
        //metodo con ciclo for i

        for(int i = 0; i< studentNames.size(); i ++){
           Student student = createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println("il nome dello studente è "+ student.Age+ " con età di " + student.name);
        }

    }
    //static void printNameAndAge(Student student) {
    //   System.out.println("il nome dello studente è "+ student.name + " con età di " + student.Age);
    //}


    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        student.Age = age;
        student.name = name;

        return student;
    }
    static void printNameAndAge(Student student) {
        System.out.println("il nome dello studente è "+ student.name + " con età di " + student.Age);
    }
    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");
        Course coursedevelhope = new Course();
        double sumAge = 0;


        for(int i = 0; i < coursedevelhope.studentAges.size(); i++){
            sumAge = coursedevelhope.studentAges.get(i) + sumAge;
        }

        // Write your code here
        double averageAge ;
        averageAge = sumAge / coursedevelhope.studentAges.size();
        System.out.println((double)Math.round(averageAge*100)/100);
        }
}

