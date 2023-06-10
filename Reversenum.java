package ArrayTwoAsign;

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0;
        while(number!=0){
            int rem=number%10;
            rev=rev*10+number;
            number=number/10;
        }
        System.out.println("the revese num is"+rev);
    }
}
