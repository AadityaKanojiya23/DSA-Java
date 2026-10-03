// Write a function to print the sum of all odd numbers from 1 to n.


import java.util.*;
public class oddnum {

    public static void sumofodd(int n ){

        int total = 0;

        for ( int i = 1 ; i<=n ; i++){
            // int total = 0;
            if (i % 2 == 1) {
                total = total + i;
            }
        }

        System.out.println("Sum of odd number between 1 to "+ n  + " is : " + total);
        
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number : ");
        int n = sc.nextInt();

        sumofodd(n);
    }
}
