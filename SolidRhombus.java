public class SolidRhombus {

   public static void main (String args []){

      int n = 4;

      // It will go reverse n-1

      for (int i = n; i >= 1; i --){

         for (int j = 1; j <= i; j ++){
            System.out.print(" ");
         }

         for (int j = 1; j <= 4; j ++){
            System.out.print("*");
         }

         System.out.println();
      }
   }
   
}
