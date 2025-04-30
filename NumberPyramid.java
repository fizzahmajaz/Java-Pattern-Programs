public class NumberPyramid {

   public static void main (String args[]){
      int n = 4;
      // to print the rows
      for (int i = 1; i <= n; i ++){
         // to print the colums
         // Real logic here n-i
         for (int j = 1; j <= n-i; j ++){

            // to print the colums
            System.out.print(" ");
         }

         // to print the numbers

         for (int j = 1; j <= i; j ++){

            // will print i for consistant numbers
            System.out.print(i + " ");

         }

         System.out.println();
      }
   }
   
}
