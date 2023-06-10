package ArrayTwoAsign;

import java.util.Date;

public class Stopwatch {
    public static void main(String[] args) {
        try{
            long start=System.currentTimeMillis();
            System.out.println( new Date() + "\n");

            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");

            long end =System.currentTimeMillis();
            long  diff=end-start;
            System.out.println("dif is : " +diff);
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
