/*
  retureType functionName(type arg1 , type arg2...){  
    //operation 
  }  
*/  
import java.util.*;  
// Print a given name in a function 
 
public class FunctionMethod{

      // public static void printMyName(String name){
      //     System.out.println("Your Name is "+ name);
      //     return ;
      // }

      public static int CalculateSum(int a , int b ){
         int sum = a + b;
         return sum;

         // Shortcut  = return a + b;
      }

      public static void printfactorial(int n  ){
         //loop
         int factorial = 1;
         for(int i = n ; i>=1 ; i--){
          factorial = factorial * i;
         }
         System.out.println(factorial);
      }


      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Name : ");
        // String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a,b);
        System.out.println("2 number sum is " + sum);
        // Shortcut = sout("qdkhcej" + CalculateSum(a,b));


        //Factorial Problem
        int n = sc.nextInt();
        printfactorial(n);


        // printMyName(name); // function gets call 
      }
    }


    









 /*
    1. Function Kya Hota Hai? (0:46)
    Function code ka ek reusable block hota hai. Iska matlab hai ki aap ek baar code likhte hain aur use baar-baar program mein kahin bhi use kar sakte hain. Jaise remote ka button dabane par specific kaam hota hai, waise hi function ek input leta hai, operation perform karta hai aur output (result) deta hai.

    2. Function Ka Syntax (2:24)
    Function likhne ka structure fixed hota hai:
    Return_Type Function_Name (Parameters) { // Code }

    -Return Type (2:29): Yeh batata hai ki function ka result kis data type ka hoga (int, float, String, ya void). Agar function kuch return nahi kar raha, toh hum 'void' likhte hain (3:36).

    -Function Name (4:56): Yeh function ki pehchan hai. Java mein 'Camel Case' follow hota hai (e.g., printMyName), jahan pehla letter chhota aur agle shabd ka pehla letter bada hota hai (8:41).

    -Arguments (5:59): Yeh woh inputs hain jo function ko kaam karne ke liye diye jaate hain. Inhe comma se separate kiya jaata hai.

    3. Memory Management: Stack (12:22)
    Jab koi function call hota hai, toh woh memory mein 'Stack' ke roop mein store hota hai. Har function ka ek 'Stack Frame' banta hai. Jab function ka kaam pura ho jaata hai (return statement execute hoti hai), toh woh frame memory se hat jaata hai (13:46).

    4. Practice Problems

    -Sum of two numbers (15:51): Do numbers ka sum return karne ke liye int type ka function banaya gaya.

    -Product calculation (18:31): Direct multiplication result return karne ka example.

    -Factorial Calculation (20:01): for loop ka use karke factorial nikalna seekha. Yahan if statement ke zariye negative numbers ke liye 'Invalid' message dena bhi dikhaya gaya (24:29).

    5. Function vs Method (25:43)
    Bahut basic difference hai:

    Function: Jab code directly call kiya jaaye.
    Method: Jab wahi function kisi Class ke Object ke through call kiya jaaye (OOPs concept mein).
*/

/*
    Java mein Stack Memory ek tarah se data ko manage karne ka tareeka hai jahan functions execute hote hain. Video ke anusar (12:22), iska kaam karne ka process kuch is tarah hota hai:

    Stack Formation (13:06): Jaise aap ek ke upar ek kitab (books) ya plate rakhte hain, waisa hi structure memory mein banta hai. Ismein har ek function call ke liye ek naya 'Stack Frame' banta hai (13:46).

    Execution Flow (14:06): Jab main function kisi aur function ko call karta hai, toh woh naya function memory ke stack mein upar add ho jata hai. Saare local variables isi stack frame mein store hote hain.

    LIFO Principle: Stack LIFO (Last-In-First-Out) principle par kaam karta hai. Jo function sabse pehle call hota hai woh bottom mein hota hai, aur jo function sabse last mein call hota hai, woh sabse pehle finish hokar stack se hat (pop) jata hai (14:26).

    Memory Release: Jaise hi function apna kaam pura karke value return karta hai, uska stack frame memory se hata diya jata hai, jisse memory khali ho jati hai.
*/
