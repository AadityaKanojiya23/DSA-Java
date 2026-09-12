import java.util.*;
public class loops {
    public static void main(String[] args){
        //For loop
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        for(int i= start ; i <10 ; i++){
            System.out.println(i);
        }
        // For loop kuch is tarah kaam karta hai ki pehle initialization hota hai, phir condition check hoti hai, agar condition true hoti hai to loop ke andar ka code execute hota hai aur phir increment/decrement hota hai. Ye process tab tak repeat hoti hai jab tak condition false na ho jaye.

        //While loop.
        int x = 0;
        while(x < 10){
            System.out.println(x);
            x++;
        }
        // While loop me pehle condition check hoti hai, agar condition true hoti hai to loop ke andar ka code execute hota hai aur phir increment/decrement hota hai. Ye process tab tak repeat hoti hai jab tak condition false na ho jaye.

        //Do while loop
        int y = 99;
        do{
            System.out.println(y);
            y++;
        }while(y < 10);
        // Do while loop me pehle loop ke andar ka code execute hota hai aur phir condition check hoti hai, agar condition true hoti hai to loop ke andar ka code execute hota hai aur phir increment/decrement hota hai. Ye process tab tak repeat hoti hai jab tak condition false na ho jaye.


         // Print the table of a number n using for loop. where n= 3

         int n = 3;
         for( int i = 0 ; i<=10 ; i++){
            System.out.println( n + " X " + i + " = " + n*i);
         }
    }
}
