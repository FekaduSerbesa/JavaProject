public class projectQ5 {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a
        temporary variable?

         */
        int[]arr={4,2,1,3,6,8};
        arr[1]=arr[1]+arr[2];
        arr[2]=arr[1]-arr[2];
        arr[1]=arr[1]-arr[2];
        for (int arr2 : arr) {
            System.out.print(arr2+" ");

        }


    }
}
