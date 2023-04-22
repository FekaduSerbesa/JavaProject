public class projectQ4 {
    public static void main(String[] args) {
        /*
        4. Create a 2D array of integers. Develop a program
           which will calculate the sum of even and odd numbers
           for that array.


         */
        int[][] arr2D = {
                {5, 8, 3, 7, 9, 11, 2},
                {9, 3, 2, 4, 7, 8, 12},
            };

            int sumEven=0;
            int sumOdd=0;
            int num;
        for (int row=0;row< arr2D.length;row++){
            for (int col=0;col<arr2D[row].length;col++){
                num=arr2D[row][col];
                if(num%2==0){
                   sumEven=sumEven+=num;
                }else {

                    sumOdd+=num;

               }



        }


            }
        System.out.println(sumEven);
        System.out.println(sumOdd);

        }


                }







