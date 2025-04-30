public class ZeroOneTriangle {

   public static void main (String args[]){
      int n = 5;
   
      // Loop to print the rows
      for (int i = 1; i <= n; i ++){
         

         // Loop to print the colums
         for (int j = 1; j <= i; j ++){

            // To add (plus) the value of blocks Example:(1,1)=2, 
            int sum = i+j;

            // If the addion value comes even then print one (If the value is even 
            // it (%) will give 0 otherwise it will give it 1).
            if(sum % 2 == 0){
               System.out.print("1");
            }

            //if value is not even then print 0
            else{
               System.out.print("0");
            }
         }

         //Always run whole loop in new line

         System.out.println();
      }


   }
   
}



/*
OUTPUT:

1
01
101
0101
10101


 */