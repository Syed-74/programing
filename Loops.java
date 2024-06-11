import java.util.Scanner;

public class Loops {
     public static void main (String args[])   {
        // for(int counter=0; counter < 100;counter = counter + 1)  {
        //     System.out.println("Hello world");
        //     for(int counter=0; counter < 11; counter++)
        //     System.out.println(counter+" ");
        //     for(int i = 0; i < 7;i++);
        //     System.out.println(i);


             // int i = 0;
            // while (i < 11) {
            //     System.out.println(i);
            //     i = i+1;   
            // }



            // int i = 0;
            // do{
            //     System.out.println(i);
            //     i = i+1;
            // }while(i < 11);


            // 1.Write a program to print numbers from 1 to 10.
                
            // for(int i = 0; i< 11;i++){
            //     System.out.println(i);
            // }

            // 2.Write a program to calculate the sum of first 10 natural number.

                // int sum = 0;
                // for(int i=1; i<10;i++){
                //    i+=i;
                // }
                // System.out.println("sum:"+sum);


            // 3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

            Scanner sc = new Scanner(System.in);
            System.out.println(" positive integer");
            int num = sc.nextInt();
            System.out.println("mul"+num);
             for( int i = 0; i<11; i++){
                System.out.println(num +" x " + i + " = " + (num*i));
             }

            // 4.Write a program to find the factorial value of any number entered through the keyboard

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a factorial value");
            // int num = sc.nextInt();
            // System.out.println(num);
            // for( int i=0; i<num; i++){
            //     System.out.println("Factorial: "+ i);
            // }

                // 5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

            
        //     int result = 1;
        //     Scanner sc = new Scanner(System.in);
            
        //     System.out.print("Enter the base number ");
        //    int a = sc.nextInt();
            
        //     System.out.print("Enter the power ");
        //    int b = sc.nextInt();
                  
        //     for(int i = 1; i <= a; i++)
        //     {
        //     result *= b;
        //     }
    
        //     System.out.println("Result: "+ result);

        // 6.Write a program that prompts the user to input an c and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

        // Scanner sc = new Scanner(System.in);
        
        // int num;
        // int reverse = 0;
        // System.out.println("Enter the number");
        // int number =  sc.nextInt();
        // int temp = number; 
        // int remainder = 0;
        // while (temp>0) {

        //     remainder = temp % 10;
        //     reverse = reverse * 10 + remainder;
        //         temp /= 10;

        // }
        // System.out.println("Reverse of " + number + " is " + reverse);
        

    //    for(int i=0; i<4; i++){
    //     for(int j=0; j<5; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("*");
    //    }

   
       
    
        
           

      }
}
