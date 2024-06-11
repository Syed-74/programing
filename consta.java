import java.util.Scanner;

public class consta {
    public static void main(String[] args) {
        
        
        //  1. Take values of length and breadth of a rectangle from user and check if it is square or not.

        //  Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter a length value");
        //  int x = sc.nextInt();
        //  System.out.println("Enter a breadth value");
        //  int y = sc.nextInt();
        //  if(x==y){
        //     System.out.println("square");
        //  }else{
        //     System.out.println("square");
        //  }


        // // 2.Take two int values from user and print greatest among them.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a frst value");
        // int a = sc.nextInt();
        // System.out.println("Enter a scount value");
        // int b = sc.nextInt();
        // if(a==b){
        //     System.out.println(" greatest among");
        // }else{
        //     System.out.println("not  greatest among");
        // }

        // 3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        // Ask user for quantity
        // Suppose, one unit will cost 100.
        // Judge and print total cost for user.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Quantity");
        // int x = sc.nextInt();
        // if((x*100)>1000){
        //     System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
        // }else{
        //     System.out.println("No discount");
        // }

            // 4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
            // Ask user for their salary and year of service and print the net bonus amount.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a employee salary");
        // int x = sc.nextInt();
        // System.out.println("Enter a servive of employee");
        // int z = sc.nextInt();
        // if(z > 5){
        //     System.out.println("You will get bonus of "+(x*0.05)+"rupess");
        // }else{
        //     System.out.println("Your serves less then 5 years : sorry!");
        // }
        // 5.A school has following rules for grading system:
        // a. Below 25 - F
        // b. 25 to 45 - E
        // c. 45 to 50 - D
        // d. 50 to 60 - C
        // e. 60 to 80 - B
        // f. Above 80 - A
        // Ask user to enter marks and print the corresponding grade.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a marks");
        // int x = sc.nextInt();
        // if(x<25){
        //     System.out.println("F");
        // }else if ((x<25)&&(x>45)){
        //     System.out.println("E");
        // }else if ((x<45)&&(x>50)){
        //     System.out.println("D");
        // }else if ((x<50)&&(x>60)){
        //     System.out.println("c");
        // }else if ((x<60)&&(x>70)){
        //     System.out.println("B");
        // }else if((x<80)&&(x>100)){
        //     System.out.println("A");
        // }else{
        //     System.out.println("Not correct marks");
        // }

        // 7.Take input of age of 3 people by user and determine oldest and youngest among them.

        // Scanner sc = new Scanner(System.in);
        // System.out.println(" first person ");
        // int age1 = sc.nextInt();
        // System.out.println(" second person");
        // int age2 = sc.nextInt();
        // System.out.println(" thrd person");
        // int age3 = sc.nextInt();
        // if(age1<age2&&age1<age3){
        //     System.out.println("first person is a youngest");
        // }else if(age2<age1&&age2<age3){
        //     System.out.println("second person is a youngest");
        // }else if (age3<age1&&age3<age3){
        //     System.out.println("thrd person is a youngest");
        // }else{
        //     System.out.println("same age");
        // }
        // if(age1>age2&&age1>age3){
        //     System.out.println("first person is a oldest");
        // }else if(age2>age1&&age2>age3){
        //     System.out.println("second person is a oldest");
        // }else if (age3>age1&&age3>age3){
        //     System.out.println("thrd person is a oldest");
        // }else{
        //     System.out.println("same age");
        // }
            
        
            // 8.Write a program to print absolute vlaue of a number entered by user. E.g.-
            // INPUT: 1        OUTPUT: 1
            // INPUT: -1        OUTPUT: 1

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a number");
            // int x = sc.nextInt();
            // if(x<0){
            //     System.out.println("absolute vlaue"+(-1*x));
            // }else{
            //     System.out.println("absolute vlaue"+x);
            // }



        //  9.   A student will not be allowed to sit in exam if his/her attendence is less than 75%.
            // Take following input from user
            // Number of classes held
            // Number of classes attended.
            // And print
            // percentage of class attended
            // Is student is allowed to sit in exam or not.


    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number of classes");
    //     int a = sc.nextInt();
    //     System.out.println("Enter number of classes attended");
    //     int b = sc.nextInt();
    //     int sum = b*100/a;
    //     System.out.println(sum);
    //    if(sum>=75){
    //     System.out.println("A student will be allowed to write a exam ");
    //    }else{
    //     System.out.println("A student will be not allowed to write a exam");
    //    }


        // 10.If
        // x = 2
        // y = 5
        // z = 0
        // then find values of the following expressions:
        // a. x == 2
        // b. x != 5
        // c. x != 5 && y >= 5
        // d. z != 0 || x == 2
        // e. !(y < 10)

    //   int  x = 2;
    //   int y = 5;
    //   int z = 0;
    //   System.out.println(x == 2);
    //   System.out.println(x != 5);
    //   System.out.println(x != 5 && y >= 5);
    //   System.out.println(z != 0 || x == 2);
    //   System.out.println(!(y < 10));
        
    //    11.Write a program to check if a year is leap year or not.
    //    If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year");
    int x = sc.nextInt();
    int sum = x%400;
    if(sum==0){
        System.out.println("leap year");
    }else{
        System.out.println("not a leap year");
    }



        //    12.     Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
            // if employee is female, then she will work only in urban areas.

            // if employee is a male and age is in between 20 to 40 then he may work in anywhere

            // if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

            // And any other input of age should print "ERROR"

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a age");
            // int age = sc.nextInt();
            // System.out.println("if employee is a M or F");
            // int sex = sc.nextInt();
            // if(sex==1){
            //     System.out.println("she will work only in urban areas");
            //  }
            //  if(sex==0&&age>=20&&age<=40){
            //     System.out.println("he may work in anywhere");
            //  }
            //  if(sex==0&&age>=40&&age<=60){
            //     System.out.println("he will work in urban areas only" );
            //  }
            //  if(sex==0&&age<20||age>60){
            //     System.out.println("Error" );
            //  }


            // 13.Write a program to find maximum between two numbers

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a first Number");
            // int num1 = sc.nextInt();
            // System.out.println("Enter a second Number");
            // int num2 = sc.nextInt();
            // if(num1>num2){
            //     System.out.println(" maximum Number is "+num1);
            // }else if (num1<num2){
            //     System.out.println("maximum Number is "+num2);
            // }else{
            //     System.out.println("both are equal"+num1);
            // }


            // 14.. Write a program to check whether a number is divisible by 5 and 11 or not.

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a Number");
            // int num = sc.nextInt();
            // if(num%5==num%11){
            //     System.out.println("Yes this Numbers is divisible");
            // }else{
            //     System.out.println("No this Number is not divisible");
            // }


        //   15.  // Write a program to check whether a number is even or odd

        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter a number");
        //     int x = sc.nextInt();
        //     if(x%2==0){
        //  Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter a five subject marks");    
        //     int Physics = sc.nextInt();
        //     int Chemistry = sc.nextInt();
        //     int Biology = sc.nextInt();
        //     int  Mathematics = sc.nextInt();
        //     int Computer = sc.nextInt();
        //     int add = Physics + Chemistry + Biology + Mathematics + Computer;
        //     System.out.println(add);
        //     int per = add/5;
        //     System.out.println("Total :");
        //     System.out.println("Percentage :"+per);
        //     if(per>90){
        //         System.out.println("GRADE A");
        //     }else if (per>80){
        //         System.out.println("GREAT B");
        //     }else ifut.println("Even");
        //     }else{
        //         System.out.println("ODD");
        //     }

            // 16. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
            
            // Percentage >= 90% : Grade A
            // Percentage >= 80% : Grade B
            // Percentage >= 70% : Grade C
            // Percentage >= 60% : Grade D
            // Percentage >= 40% : Grade E
            // Percentage < 40% : Grade F


            //  (per>70){
            //     System.out.println("GREAT C");
            // }else if (per>60){
            //     System.out.println("GREAT C");
            // }else if (per>40) {
            //     System.out.println("GREAT D");
            // }else{
            //     System.out.println("GREAT F");
            // }


                 // 17.The current year and the year in which the employee joined the organization are entered through the keyboard. If the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If the years of service are not greater than 3, then the program should do nothing.
        
    
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a current year");
            // int x = sc.nextInt();
            // System.out.println("Enter a join year");
            // int z = sc.nextInt();
            // int sum = x-z;
            // if(sum>3){
            //     System.out.println("a bonus of Rs. 2500/-");
            // }else{
            //     System.out.println("no bonus");
            // }

            // 18.  //10. Write a Java program to create a simple calculator   

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter A Numbers");
            // boolean num1 = sc.nextBoolean();
            // System.out.println("Enter B Number");
            // boolean num2 = sc.nextBoolean();
            // System.out.println("Choose an Operation to Perform. E.g.: +, -, *, /, ^ :");
            // int p = sc.nextInt();
            // char o = sc.next().charAt(0);
            // System.out.println("A Number ="+num1);
            // System.out.println("B Number ="+num2);
            // System.out.println("Operator = " + o);
            // System.out.println("Result : " +  num1+ o + num2 +  " = ");
            // if(o=='+'){
            //     System.out.println("num1+num2");
            // }else if (o=='-'){
            //     System.out.println("sum1-num2");
            // }else if (o=='*'){
            //     System.out.println("num1*num2");
            // }else if (o=='/'){
            //     System.out.println("num1/num2");
            // }else if (o=='^'){
            //    System.out.println("num1^num2");
            // }else{
            //     System.out.println("Invalid Operator.");
            // }


          
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a age");
            // int age = sc.nextInt();
            // if (age >= 18) {
            //     System.out.println("you can vote");
            // }else{
            //     System.out.println("you can't vote");
            // }
             
          


    }
}

