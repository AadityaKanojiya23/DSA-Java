import java.util.*;

public class BestPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Nested for loop to print the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int n = sc.nextInt();

        // System.out.print("Enter the number of columns for the pattern: ");
        // int p = sc.nextInt();


        // this outer loop is used to print the rows of the pattern
        for(int i = 1 ; i <= n ; i++){

            // this inner loop is used to print the columns of the pattern.
            for(int j = 1 ; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Holo Square Pattern
       for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        // Ye pura system kuch is tarah kaam ki like pahele outer loop main jab i = 1 tha tab inner loop main j = 1,2,3,4,5 tak chala aur print kiya * * * * * phir outer loop main i = 2 tha tab inner loop main j = 1,2,3,4,5 tak chala aur print kiya *       * phir outer loop main i = 3 tha tab inner loop main j = 1,2,3,4,5 tak chala aur print kiya *       * phir outer loop main i = 4 tha tab inner loop main j = 1,2,3,4,5 tak chala aur print kiya * * * * *


        // Right Triangle Pyramid Pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Right Triangle Pyramid Pattern
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // loop 1 chalta hai ek condition ke saat fir loop 2 us condition ko check karte karte pura kaam karta hia or print karta hia inner loop ka kaam khatam toh exit ab outer loop main kuch nhi hia print karne ko toh empty ab outer loop ka condition change hota hai but inner loop pura reset ho jata hia fir se inner loop ka kaam start hota hia fir se print karta hia ye pura process tab tak chalta hia jab tak outer loop ka condition false na ho jaye.

        // Right Triangle Pyramid Pattern

          int k = 4;
          for(int i =1 ; i<=k; i++){
            for (int j = 1; j<=k-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); 
          }  
           ///NEW 
          for(int i = 1 ; i <=5 ; i++){
            for( int j = 1 ; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println();
          }

          //NEW 
          int h = 5;
          int number = 1;
          for( int i = 1 ; i <= h ; i++){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
          }

          // 0-1 switch right angle triangle pattern

          
    }
}
