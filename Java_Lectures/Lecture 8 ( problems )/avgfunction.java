//Enter 3 numbers from the user & make a function to print their average.


import java.util.*;
public class avgfunction {

    public static void avgofthree(float a , float b, float c ){
        
        float avg = ( a + b + c)/3 ;
        System.out.println("Hence the avg of 3 number is : " + avg);

    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd Number : ");
        float b = sc.nextFloat();
        System.out.print("Enter 3rd Number : ");
        float c = sc.nextFloat();

        avgofthree(a, b, c);
    }
}
