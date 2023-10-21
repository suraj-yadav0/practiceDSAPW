package OOPS;

public class StudentClass {

    public static class Student {
       String name;
       int rno;
       double age;

       public Student(String nam, int rl, double ag) {
           name = nam;
           rno =  rl;
           ag = age;
       }
    }

    static void fun(Student s){
        System.out.println(s.name);
    }
    public static void main(String[] args) {

        class  Car {
            String model;
            int version;
        }
      Student s = new Student("Suraj",2129753,22);
//        s.name = "Suraj";
//        s.age = 22;
//        s.rno = 2129753;

        Car c = new Car();
        c.model = "Honda Civic";
        c.version = 1;

       fun(s);
        System.out.println(c.model);
    }
}
