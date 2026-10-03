// Write a function to print the sum of all odd numbers from 1 to n.


import java.util.*;
public class identifygreater {

    public static void greter(int a , int b ){
        if(a<b){
            System.out.print(b + " is greater then " + a);
        }else{
            System.out.print(a + " is greater then " + b);
        }
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        greter(a, b);
    }
}
