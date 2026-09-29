import java.util .*;

public class adavancepattern {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        // Butterfly Pattern
        /*
            *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      *    
        */

         int n = 4;

         //First Half  - upper part 
         for ( int i=1 ; i<=n; i++ ){
            // First part 
            for(int j=1 ; j <=i; j++){
                System.out.print("*");
            }

            //Spaces 
            int spaces = 2 * ( n - i );
            for ( int j = 1 ; j<=spaces; j++){
                System.out.print(" ");
            }

            // Second Part 
            for( int j = 1 ; j<=i ; j++){
               System.out.print("*"); 
            }
            System.out.println();
         }

         //Second Half  - lower part 
         for ( int i=n ; i>=1; i-- ){
            // First part 
            for(int j=1 ; j <=i; j++){
                System.out.print("*");
            }

            //Spaces 
            int spaces = 2 * ( n - i );
            for ( int j = 1 ; j<=spaces; j++){
                System.out.print(" ");
            }

            // Second Part 
            for( int j = 1 ; j<=i ; j++){
               System.out.print("*"); 
            }
            System.out.println();
         }

         /*  Solid Rhombus

             *****
            *****
           *****
          *****
         *****

         */
        int k = 5;

        for (int i = 1; i <= k; i++) {

            // Spaces
            for (int j = 1; j <= k - i; j++) {
                System.out.print(" ");
            }
        
            // Stars
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }

        /* Number Pyramid 
                 1
                2 2
               3 3 3
              4 4 4 4
             5 5 5 5 5

        */

             
    }
}