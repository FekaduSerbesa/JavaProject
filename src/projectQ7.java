public class projectQ7 {
    public static void main(String[] args) {
        /*
        7. Write a Java Program to print the first 10 numbers of
           Fibonacci series.
        the sum of the previous two 0+1=1, 1+1=2, 1+2=3,2+3=5, 3+5=8,5+8=13, 8+13=21 etc
        1, 2,3,5,8,13,21...
         */
        int a, b,c;
        a=0;
        b=1;
        for(int i=1;i<10;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
