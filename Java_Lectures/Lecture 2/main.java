import java.util.*;  // import java.util.* ka matlab hai ki java.util package ke sare classes ko import karna hai jisse hum Scanner class ka use kar sake.


public class main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to Java Lectures!");
        System.out.print("Hello, welcome to Java Lectures!\n");
        System.out.print("Hello, welcome to Java Lectures!\n");
        System.out.print("Hello, welcome to Java Lectures!\nThis is a new lecture 2\nSo just enjoy the lecture and learn Java programming language\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");




        // Data Types in Java:

        String name = "Adiya";


        int a = 25;
        int b = 5;
        int sum = a + b;
        int mul = a * b;
        int sub = a - b;
        int div = a / b;
        int mod = a % b;
        
        // System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // System.out.println("Hello, " + name + "!");

        System.out.println("Hello , " + name + " your calculation of 25 + 30 is : " + sum + " and multiplication is : " + mul + " and subtraction is : " + sub + " and division is : " + div + " and modulus is : " + mod);


        // User asked value 

        
        Scanner sc = new Scanner(System.in);  // System.in ka matlab hai ki user se input lena hai or new Scanner ka matlab hai ki ek naya scanner object create karna hai jisse user se input liya ja sake.

        System.out.print("Enter first number: ");
        int x = sc.nextInt();  // nextInt ka matlab hai ki user se integer value lena hai.

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int sume = x + y;

        System.out.println("The sum of " + x + " and " + y + " is: " + sume);
    }
}

//scanner class kya hai ? ye ek class hai jo java.util package me hoti hai aur ye user se input lene ke liye use hoti hai.