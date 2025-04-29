public class HalfPyramid {
   public static void main (String args[]){
      int n = 5;


      // Loop to print the rows
      for (int i = 0; i <= n; i++){

         // Loops to print the colums
         for (int j= 0; j <=i; j ++){

            System.out.print("*");
         }

         // This print ln is to run the whole for loop every time in new line
         System.out.println();

      }
      
   }
   
}


/*Output:
 
*
**
***
****
*****
******

 */
