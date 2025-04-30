public class DiamondPattern {

   public static void main(String args[]) {
      int n = 4;


      // Upper side
      // It will go 1 - n
      for (int i = 1; i <= n; i++) {
         // to print the colums
         // Real logic here n-i
         for (int j = 1; j <= n - i; j++) {

            // to print the colums
            System.out.print(" ");
         }

         // to print the numbers

         for (int j = 1; j <= 2*i-1; j++) {

            // will print i for consistant numbers
            System.out.print( "*");

         }

         System.out.println();
      }

      // Lower side
      // It will go n - 1
      for (int i = n; i >= 1; i--) {
         // to print the colums
         // Real logic here n-i
         for (int j = 1; j <= n - i; j++) {

            // to print the colums
            System.out.print(" ");
         }

         // to print the numbers

         for (int j = 1; j <= 2*i-1; j++) {

            // will print i for consistant numbers
            System.out.print( "*");

         }

         System.out.println();
      }
   }

}
