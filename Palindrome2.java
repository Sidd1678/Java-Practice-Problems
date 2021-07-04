import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        String orignal,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter number or string");
        orignal=sc.nextLine();
        int size=orignal.length();
        for(int i=size-1;i>=0;--i)
        {
            reverse = reverse + orignal.charAt(i);
        }
        if(reverse.equals(orignal))
        System.out.println(orignal + "is a palindrom ");
        else
        System.out.println(orignal + "is not a palindrom ");
        
    }
}
