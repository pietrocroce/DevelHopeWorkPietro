package JavBasic_OOP_2;

public class Student {
     String name;
    Integer Age;

    public Student(String name, Integer Age){
        System.out.println("constructing");
        System.out.println(name + Age);
        System.out.println("constructed");
        this.name=name;
        this.Age= Age;
    }
    public  Student(Integer Age){
      this.Age = Age;
    }
    public Student(String name){
       this.name = name;
    }
    public Student(){

    }


}
