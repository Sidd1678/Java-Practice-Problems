import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Palindrome {
    public static void main(String[] args)
    {
        String original,reverse="";
        Scanner s=new Scanner(System.in);
        System.out.println("enter number or string");
        original=s.nextLine();
        int length = original.length();
        for(int i=length-1;i>=0;--i)
        reverse = reverse + original.charAt(i);
        if(original.equals(reverse))
        System.out.println("its a pelindrome");z
        else 
        System.out.println("its not a pelindrome");
        
    }
}
