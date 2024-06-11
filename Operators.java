import java.util.*;

public class Operators {
    public static void main(String[] args) {
        // ADD
        // int a = 45;
        // int b = 55;
        // int sum = a+b;
        // System.out.println(sum);

        // // ‘-’ Subtract
        // int x = 56;
        // int y = 12;
        // int diff = x - y;
        // System.out.println(diff);

        // // ‘*’ Multiply
        // int s = 56;
        // int m = 12;
        // int mul = s * m;
        // System.out.println(mul);

        // // ‘/’ Divide

        // int j = 56;
        // int k = 12;
        // int div = j / k;
        // System.out.println(div);

        // // ‘%’ Modulo - Remainder of a/b

        // int l = 56;
        // int p = 12;
        // int modulo = l / p;
        // System.out.println(modulo);

        // 1.Length and breadth of a rectangle are 5 and 7 respectively. Write a program
        // to calculate the area and perimeter of the rectangle.

        // int a = 5;
        // int b = 7;
        // int mul = a*b;
        // System.out.println(mul);

        // int x = 5;
        // int y = 7;
        // System.out.println("Area is "+(5*7)+"\nPerimeter is "+(2*(5+7)));

        // 2.Write a program to calculate the perimeter of a triangle having sides of
        // length 2,3 and 5 units

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a value");
        // int length2 = sc.nextInt();
        // int length3= sc.nextInt();
        // int length5 = sc.nextInt();

        // int add = length2 + length3 + length5;
        // System.out.println(add);

        // 3.Write a program to add 8 to the number 2345 and then divide it by 3. Now,
        // the modulus of the quotient is taken with 5 and then multiply the resultant
        // value by 5. Display the final result.

        // Scanner sc = new Scanner(System.in);
        // int a = 2353;
        // int b = 3;
        // int div = a/b;
        // System.out.println(div);

        // int x = div%5;
        // System.out.println(x);

        // int y = x*5;
        // System.out.println(y);

        // 3.Write a program to check if the two numbers 23 and 45 are equal.

        // Scanner sc = new Scanner(System.in);
        // int a = 23;
        // int b = 45;
        // System.out.println(23==45);

        // 4.Write a program to print the power of 7 raised to 5.

        // Scanner sc = new Scanner(System.in);
        // int a =7;
        // int b =5;
        // System.out.println(Math.pow(a,b));

        // 5.Assign values of variables 'a' and 'b' as 55 and 70 respectively and then
        // check if both the conditions 'a < 50' and 'a < b' are true.

        // int a = 55;
        // int b = 70;
        // System.out.println(a < 50 && a < b);

        // OR EK METHORD

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a value a");
        // int a = sc.nextInt();
        // System.out.println("enter a value b");
        // int b = sc.nextInt();

        // if(a < 50 && a < b ){
        // System.out.println(true);
        // }else{
        // System.out.println(false);
        // }

        // 6.If the marks of Robert in three subjects are 78,45 and 62 respectively
        // (each out of 100 ), write a program to calculate his total marks and
        // percentage marks.

        // int eng = 78;
        // int mat = 45;
        // int bio = 62;
        // int add = eng + mat + bio;
        // System.out.println(add);
        // int percentage = add*100/300;
        // System.out.println(percentage);

        // 7.Write a program to calculate the sum of the digits of a 3-digit number.
        // Number : 132 Output : 6

        int num1= 1+2;
        int num2 = 3;
        int add = num1+num2;
        System.out.println(add);

        // 8.Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
        // int num = 123;
        // int reverse = 321;
        // System.out.println(reverse);

        // Arithmetic operators
        // int a = 10;
        // int b = 3;

        // System.out.println("a + b = " + (a + b));
        // System.out.println("a - b = " + (a - b));
        // System.out.println("a * b = " + (a * b));
        // System.out.println("a / b = " + (a / b));
        // System.out.println("a % b = " + (a % b));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a first number :");
        // float a = sc.nextInt();
        // System.out.println("Enter a second number :");
        // float b = sc.nextInt();
        // float mul = a*b;
        // System.out.println(mul);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // System.out.println("Enter a number ");
        // int b = sc.nextInt();
        // int total = a+b;
        // System.out.println(total);

        // String firstname = "Ilove";
        // String secondname = "You";
        // String fullname = firstname + secondname;
        // System.out.println(fullname);
        // for (int i = 0; i < fullname.length(); i++) {
        //     System.out.println(fullname.charAt(i));
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value first :");
        int a = sc.nextInt();
        System.out.println("Enter a value second :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        int tol = sum*2;
        System.out.println(tol);
       
    }

}
