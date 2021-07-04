import java.util.Scanner;

import javax.print.event.PrintEvent;

class CheckPrime
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number : ");
        int n  = s.nextInt();
        if(isPrime(n))
        {
            System.out.println( n +  "is a prime number");
        }
        else
        {
            System.out.println( n +  "is not a prime number");
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<Math.sqrt(n);++i)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}