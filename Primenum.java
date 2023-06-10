package ArrayTwoAsign;

import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num %i==0){
                result=result+1;
            }

        }
        if(result<2){
            System.out.println(" prime num number");
        }
        else{
            System.out.println(" not prime num number");
        }
    }
}
