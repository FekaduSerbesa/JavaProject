public class projectQ1 {
    public static void main(String[] args) {
        /*
        1. Create a program that uses an array to store a list of
           temperatures for a week, and then uses a loop to find
           the highest and lowest temperature for the week.

         */
        int[] temps={90, 87,70,95,100,65};
        int temphighest=temps[0];
         for(int temp:temps){
             if(temp>temphighest){
                 temphighest=temp;
             }


             }
        System.out.println(temphighest);


         }

     }




