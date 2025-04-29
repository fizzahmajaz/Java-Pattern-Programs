public class InvertedHalfPyramid {

   public static void main (String args[]){

      int n = 5;
      
      // Loop to print rows
      for (int i = n; i >=1; i --){

         // Loop to print colums
         for (int j = 1; j <= i ; j ++){
            System.out.print("*");
         }


         // This print ln is to run the whole for loop every time in new line
         System.out.println();
      }
   }
   
}




/*Output:
 
*****
****
***
**
*

 */

