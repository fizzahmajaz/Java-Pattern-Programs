public class PalindomicPattern {

   public static void main (String args[]){
      int n = 5;

      for (int i = 1; i <= n; i ++){
         for (int j = 1; j <= n-i; j ++){
            System.out.print(" ");
         }
         // Going bacward
         for (int j = i; j >= 1; j --){
            System.out.print(j);
         }
         // Going forward
         for (int j = 2; j <= i; j ++){
            System.out.print(j);
         }
         System.out.println();
      }
   }
   
}

/* 
OUTPUT:

    1
   212
  32123
 4321234
543212345

*/

