import java.util.*;
// class pen{
//     String color;
//     String types;

import javax.print.attribute.standard.MediaSizeName;


//     public void write(){
//         System.out.println("My name is XYZ");
//     }
// }
    

 class student  {
   String name;
   int age;

//    public void println(){
//     System.out.println(this.name);
//     System.out.println(this.age);
//    }


          // polymorphism
//    1. compile time polymorphism(static)
  public void PrintInfo(String name){
    System.out.println(name);
  }
  public void PrintInfo(int age){
    System.out.println(age);
  }
  public void PrintInfo(String name , int age){
    System.out.println(name);
    System.out.println(age);
  }


    
}
    

public class oops {
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.types = "gel";

        // pen1.write();

        // student s1 = new student();
        // s1.name = "XYX";
        // s1.age = 18 ;
         
        // s1.println();



        student s1 = new student();
        s1.name = "aman";
        s1.age =23;
        s1.PrintInfo(s1.name);





    }
}
