import java.util.Scanner;


public class ioputs {
    public static void main(String[] args) {

    //      1. java practice questions on input and output

    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.nextInt();
    //     int y = sc .nextInt();
    //     System.out.println(x+y);


    //     2. Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results.

    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     int p = x+y;
    //     int q = x*y;
    //     System.out.println("Sum : "+q+"\nProduct : "+p);

    //     3. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

        // Scanner sc = new Scanner(System.in);
        // double n = sc.nextInt();
        // double m = sc.nextInt();
        // double area = n*m;
        // System.out.println((int)area);

    //     3.ake name, roll number and field of interest from user and print in the format below :
    //     Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a Name");
    //     String a = sc.nextLine();
    //     System.out.println("Enter a Roll.No");
    //     int b = sc.nextInt();
    //     System.out.println("Enter a field of interest ");
    //     String c = sc.nextLine();
    //     System.out.println("Hey, my name is " +a+ "my roll number is " +b+ "My field of interest in volly boll"
    //     +c+ ".");

    //     4.Take side of a square from user and print area and perimeter of it.

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a Side");
    //     int a = sc.nextInt();
    //     System.out.println("Area : "+(a*a)+"\nPerimeter : "+(4*a));
        
    //    5. Write a program to find square of a number.
    //         input is 2 , output is 4.
    //     Scanner sc = new Scanner(System.in);
    //     int sum = sc.nextInt();
    //     int a = 2;
    //     int b = 2;
    //     sum = a*b;
    //     System.out.println(sum);
       
    //     input is 5 , output is 25.
    //     Scanner sc = new Scanner(System.in);
    //     int sum = sc.nextInt();
    //     int n = 5;
    //     int m = 5;
    //     sum = n*m;
    //     System.out.println(sum);

    //    6. Take two different string input and print them in same line

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("First String");
    //     String a = sc.nextLine();
    //     System.out.println("Second String");
    //     String b = sc.nextLine();
    //     System.out.println( " print them in same line\r\n" +"");

    //  7. // Take 3 inputs from user and check :
    // all are equal
    // any of two are equal
    // ( use && || )

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a first Number");
    // int a = sc.nextInt();
    // System.out.println("Enter a second Number");
    // int b = sc.nextInt();
    // System.out.println("Enter a thred Number");
    // int c = sc.nextInt();
    // System.out.println("all are equal"+(a==b&&b==c&&c==a));
    // System.out.println("any of two are equal"+(a==b||b==c||c==a));


        // 8.Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a value of a");
        //   int a = sc.nextInt();
        // System.out.println("Enter a value of b");
        // int b = sc.nextInt();
        // if(a<50 & a <b){
        //     System.out.println(true);
        // }else{
        //     System.out.println(false);
        // }



        // 9. If the marks of Robert in  are entered through keyboard (each out of 100 ), write a program to calculate his total marks and percentage marks.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a first subjects ");
        // double eng = sc.nextInt();
        // System.out.println("Enter a second subject");
        // double maths = sc.nextInt();
        // System.out.println("Enter a thred subject");
        // double bio = sc.nextInt();
        // double add =  eng + maths + bio;
        // double percentage = add*100/ 300;
        // System.out.println(add);
        // System.out.println(percentage);


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a integer");
        // int a = sc.nextInt();
        // System.out.println("Emter a integer");
        // int b = sc.nextInt();
        // int sum = (a+b) ;
        // System.out.println(sum);

        
        // 10.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        // Scanner sc =  new Scanner(System.in);
        // int number;
        // char choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // do{
        //     System.out.println("Enter the number");
        //     int num = sc.nextInt();
        // if(num % 2 == 0){
        //     evenSum += num;
        // }else{
        //     oddSum += num;
        // }
        // System.out.println("Do you want to continue y/n? ");
        //  choice = sc.next().charAt(0); 
        // }while(choice=='y' || choice == 'Y');
        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of even numbers: " + oddSum);


     
        //         Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        // Marks        Grade
        // 91-100         AA
        // 81-90          AB
        // 71-80          BB
        // 61-70          BC
        // 51-60          CD
        // 41-50          DD    
        // <=40          Fail

        Scanner sc = new Scanner(System.in);
        int marks = sc .nextInt();
            if(marks>100){
                System.out.println("You Enter the marks higher than 100");
            }else if (marks<100&&marks>91){
                System.out.println("THE GRADE OF THA STUDENT IS AA");
            }else if (marks<90 && marks>81){
                System.out.println("THE GRADE OF THA STUDENT IS AB");
            }else if (marks<80&&marks>71){
                System.out.println("THE GRADE OF THA STUDENT IS BB");
            }else if (marks<70&&marks>61){
                System.out.println("THE GRADE OF THA STUDENT IS BC");
            }else if (marks<60&&marks>51){
                System.out.println("THE GRADE OF THA STUDENT IS CD");
            }else if(marks<50&&marks>41){
                System.out.println("THE GRADE OF THA STUDENT IS DD");
            }else if(marks<=40){
                System.out.println("THE GRADE OF THA STUDENT IS FAIL");
            }else{
                System.out.println(marks);
            }
        


}
}
