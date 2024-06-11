import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // if(num<0){
        //     System.out.println("Negative");
        // }
        // else{
        //     System.out.println("Positive");
        // }

        // Leap year or not
        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter a years");
        //   int year = sc.nextInt();
        //   if(year%400==0 || (year % 4 == 0 && year % 100 != 0))
        //     System.out.println(year+ "is a leap year");
        //   else 
        //     System.out.println(year+ "is  not a leap year");
        

        // Prime number
        // int n,count=0,i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a prime number");
        //  int num = sc.nextInt();
        // for(i=1; i<=num;i++)
        // {
        //     if(num % i==0)
        // {
        //     count++;
        // }
        // }
        // if(count==8)
        // System.out.println("prime number");
        // else
        // System.out.println("Not a prime number");



        // Prime number within a given range

    //     int lower = 1, upper = 20 ;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter:");
    //     for(int i = lower; i <= upper; i++){
    //         if(isPrime(i));
    //         System.out.println(i);
    //     }
    //     static boolean isPrime (int n){
    //         int count = 0;
    //         if (n < 2)
    //    return false;

    //  // checking the number of divisors b/w 1 and the number n-1
    //  for (int i = 2; i < n; i++)
    //    {
    //  if (n % i == 0)
    //     return false;
    //    }
    // // if reached here then must be true
    //  return true;

        
    // int n, sum=0;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a");
    // n = sc.nextInt();
    // while (sum<=0) {
    //     n=n%10;
    //     sum=sum+n;
    //     n=n/10;
    //     System.out.println("Sum of digits:");
    //    }

      int sum = 2;
      for(int i = 0; i<=10;i++){
        sum = sum + 1;
      }
      System.out.println(sum);
     
        }
        
      }