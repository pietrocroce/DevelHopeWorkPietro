package JavBasic_OOp_3;

import java.util.Locale;

public class Student {
      String name;
      int age;

      String surname;
    private String citywasborn;
    private Boolean ismaggiorenne;
    private String testmaggiorenne;
    private int counterforeverynewstudent = 0;
    private int limitforstudenttoaccesstothecourse;

    public int getstudentAge() {
        return this.age;
    }

    public void setstudentAge(int age) {
        if (age > 14 && age < 35) {
            this.age = age;
        } else System.out.println("The student hasn't the right years to make this course");
    this.age= age;
    }

    public String getstudentName() {
        counterforeverynewstudent++;
        return this.name;
    }

    public void setstudentName(String name) {

        this.name = name;
    }

    public String getstudentSurname() {
        return this.surname;
    }

    public void setstudentSurname(String surname) {
        this.surname = surname;
    }

    public String getoriginCity() {

        return this.citywasborn;
    }

    public void setoriginCity(String citywasborn) {

        this.citywasborn = citywasborn;
    }

    public void setIsmaggiorenne(Boolean ismaggiorenne) {
        if (age >= 18) {
            this.ismaggiorenne = ismaggiorenne;
        }else this.ismaggiorenne= ismaggiorenne;
    }

    public String getIsmaggiorenne() {
        if (age >=18) {
            testmaggiorenne=  "is an adult";
        }else testmaggiorenne= "the student is too young";
        return testmaggiorenne;
    }
    public int getCounterforeverynewstudent() {
        return counterforeverynewstudent;
    }

    public void setCounterforeverynewstudent(int counterforeverynewstudent) {
        if (counterforeverynewstudent <= limitforstudenttoaccesstothecourse) {
            this.counterforeverynewstudent = counterforeverynewstudent;
        } else System.out.println("reach the maximum number of student");

    }
    public int getLimitforstudenttoaccesstothecourse() {
        return limitforstudenttoaccesstothecourse;
    }

    public void setLimitforstudenttoaccesstothecourse(int limitforstudenttoaccesstothecourse) {
            this.limitforstudenttoaccesstothecourse = limitforstudenttoaccesstothecourse;
    }
}