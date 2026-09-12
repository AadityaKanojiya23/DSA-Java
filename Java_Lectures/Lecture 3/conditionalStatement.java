 import java.util.*;
 
 
 public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        if(sum < 0 ){
            System.out.println("Sum is less than 0");
        } else if(sum == 0){
            System.out.println("Sum is equal to 0");
        } else if(sum > 0 && sum <= 100){
            System.out.println("Sum is greater than 0 and less than or equal to 100");
        } else if(sum > 100 && sum <= 200){
            System.out.println("Sum is greater than 100 and less than or equal to 200");
        } else {
            System.out.println("Sum is greater than 200");
        }


        // Switch case statement in java:
        System.out.print("Enter a button number between 1 to 7: ");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Button 1 is pressed");
                break;
            case 2:
                System.out.println("Button 2 is pressed");
                break;
            case 3:
                System.out.println("Button 3 is pressed");
                break;
            case 4:
                System.out.println("Button 4 is pressed");
                break;
            case 5:
                System.out.println("Button 5 is pressed");
                break;
            case 6:
                System.out.println("Button 6 is pressed");
                break;
            case 7:
                System.out.println("Button 7 is pressed");
                break;
            default:
                System.out.println("Invalid button pressed");
                break;
        }

        System.out.print("Enter day to check your Schedule: ");
        String day = sc.next();
        switch(day){
            case "Monday":
                System.out.println("You have to go to school");
                break;
            case "Tuesday":
                System.out.println("You have to go to school");
                break;
            case "Wednesday":
                System.out.println("You have to go to school");
                break;
            case "Thursday":
                System.out.println("You have to go to school");
                break;
            case "Friday":
                System.out.println("You have to go to school");
                break;
            case "Saturday":
                System.out.println("You have to go to school");
                break;
            case "Sunday":
                System.out.println("You have a holiday");
                break;
            default:
                System.out.println("Invalid day entered");
                break;
        }
    }
}
