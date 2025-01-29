import java.util.Scanner;
public class DigitalCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1,num2;
        String operation;
        System.out.println("**** Welcome To The Digital Calculator ****");

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Choose one of the mathematical operation (+,-,*,/): ");
        operation = scanner.nextLine();



        if(operation.isEmpty()){

            System.out.println("You did not enter an mathematical operation");
        }
        else{
            System.out.println("You chose the "+operation+" operation");
        }

        System.out.print("Enter the second number:");
        num2 = scanner.nextInt();

        // Up to here everything is tasted and is fine

        switch(operation){

            case "+":
                int resultAdding = num1+num2;
                System.out.println("The sum of adding the first number with the second number is "+resultAdding);
                break;

            case "-": int resultSubtraction = num1-num2;
                System.out.println("The sum of subtracting thr first number with the second number is "+resultSubtraction);
                break;

            case "/":
                    if(num2==0){ // here it is Yallow collor
                        System.out.println("Erorr ....Number2 can not be Zero in division operation  ");
                        break;
                    }
                    else{
                        int resultDividing = num1/num2;
                        System.out.println("The sum of dividing thr first number with the second number is "+resultDividing);
                        break;
                    }

            case "*": int resultMultiplying = num1 * num2;
                System.out.println("The sum of multiplying thr first number with the second number is "+resultMultiplying);
                break;
        }
    }
}