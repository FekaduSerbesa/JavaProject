public class projectQ10 {
    public static void main(String[] args) {
        /*
        10. Write a program to print out duplicate elements from
            an Array of Strings?

         */
        String[]names={"Ebba","Adam","Mulu","Fekadu","Adam","Mulu"

        };
        for(int i=0;i< names.length;i++){
            for(int j=0;j<names.length;j++){
                if(names[i].equals(names[j]))
                    System.out.println(names[i]);
            }
        }
    }
}
