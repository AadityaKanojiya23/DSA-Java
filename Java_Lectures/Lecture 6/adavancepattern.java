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
        int a = 5;
        for(int i =1; i<=a ; i++){
            //Spaces 
            for(int j = 1 ; j<=a-i ; j++){
                System.out.print(" ");
            }

            //Number ( print row number with row number times )
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         Palindromic Pattern
                 1
               2 1 2
             3 2 1 2 3
           4 3 2 1 2 3 4
         5 4 3 2 1 2 3 4 5
        */

        for (int i = 1; i <= a; i++) {
        
            // Spaces
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
        
            // First half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
        
            // Second half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
        
            System.out.println();
        }
        
        /* Diamond Pattern 
        
         *
        ***
       *****
      *******
      *******
       *****
        ***
         *

        */

        int h = 4 ;

        /* UPPER HALF  */

        for(int i = 1 ; i<=h ; i++){

            // First Half Space 
            for(int j=1 ; j<=h-i ; j++){
                System.out.print(" ");
            }

            // First Half Stars Print 
            for(int j = 1 ; j<=2*i-1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        /* LOWER HALF */

        for(int i = h ; i>=1 ; i--){

            // Second Half Space 
            for(int j=1 ; j<=h-i ; j++){
                System.out.print(" ");
            }

            // Second Half Stars Print 
            for(int j = 1 ; j<=2*i-1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}