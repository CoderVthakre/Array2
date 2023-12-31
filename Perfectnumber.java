package ArrayTwoAsign;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        //Just like the Armstrong number, the Perfect Number is also a special type of positive number.
        // When the number is equal to the sum of its positive divisors excluding the number,
        // it is called a Perfect Number. For example, 28 is the perfect number because when we sum the divisors of 28,
        // it will result in the same number.
        //The divisors of 28 are 1, 2, 4, 7, and 14. So,
        //      b. 28 = 1+2+4+7
        //c. 28 = 28
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num %i==0){
                result=i+result;
            }

        }
        if(result==num){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
