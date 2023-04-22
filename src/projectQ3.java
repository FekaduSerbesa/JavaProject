public class projectQ3 {
    public static void main(String[] args) {
        /*
        3. Create a 2D array or integer type where you will store
            odd and even numbers. Develop a program which will
            identify/print the even numbers only

         */
        int[][] numbers = {
                {5, 6, 2, 15},
                {18, 33, 9, 20, 6},

        };
        for (int[] number : numbers) {
            for (int num :  number) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }



            }
        }
    }
}