import java.util.*;
public class Function {
            // ----1---
        // public static void PrintMyname(String name){
        //     System.out.println(name);
        //     return;
        // }

            // ----2----
        // public static int addSum(int a , int b ){
        //     int sum = a + b;
        //     return sum;
        // }

            // ----3----
        // public static int mul (int a , int b ){
        //     int mul = a*b;
        //     return mul;
        // }

            // ----4----
        // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        // public static int circle (int x , int y){
        //     int sum = x + y ;
        //     return circle(x, y);
        // }
            
            // ----5----
        
            // Write a program to print the factorial of a number by defining a method named 'Factorial'.

            public static int factorial(int x){
                if(x == 0 || x == 1){
                        return 1;
                }else{
                    return factorial(x-1)*x;
                }
            }

        
        
        
            public static void main(String[] args) {
            // ----1----
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // PrintMyname(name);

            // ----2----
        // Scanner sc = new Scanner (System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();

        //     int sum = addSum(a, b);
        //     System.out.println(sum);
            // ----3----
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = mul (a , b);
        // System.out.println(sum);

            // ----4----

        // Scanner sc = new Scanner(System.in);
        // System.out.println("ENter a number");
        // int x = sc.nextInt();
        // System.out.println("Enter the another number");
        // int y = sc.nextInt();
        // int sum = (x+y);
        // System.out.println(sum);
        // System.out.println("Enter Mltiply number");
        // int mul = sc.nextInt();
        // int total = sum*mul;
        // System.out.println(total);

            // ----5----
                System.out.println(factorial(5));
                System.out.println(factorial(10));
                System.out.println(factorial(1));
                System.out.println(factorial(0));






        }
    }

