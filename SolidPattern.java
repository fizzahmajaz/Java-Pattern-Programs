public class SolidPattern{

   public static void main (String args[]){

      int n = 4;
      int m = 5;


      // This for loop is for rows
      for (int i = 1; i <= n; i ++ ){

         // This for loop is for colums
         for (int j = 1; j<= m; j ++){

            // Don't write ln here with print 
            //becasue it will print all the stars in new line
            System.out.print("*");

         }

         // This print ln is to run the whole for loop every time in new line
         System.out.println();
      }



   }



}



/* OUTPUT:

*****
*****
*****
*****

   */
