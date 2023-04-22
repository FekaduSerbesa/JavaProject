import javax.swing.*;
import java.util.Scanner;

public class projectQ6 {
    public static void main(String[] args) {
        /*
        6. Write a java program to check whether a given
           number is prime or not?

                 */

        /*
        a prime number should be >1
        and divisible by one and itself only
        check 3(2,3), 4(2,3,4), 5(2,3,4,5) etc
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integer number");

        int num=scanner.nextInt();
        boolean isPrime=true;
        if(num>2) {
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;

                }
            }
        }else {
            isPrime=false;
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+"is not a prime number");
        }
        }
}
