
import java.util.Scanner;

class Calculate{

    Scanner scanner = new Scanner(System.in);
public void Calc(){

    char op = 'e';
    int num1 = 0;
    int num2 = 0;
    boolean again = true;

do{
    System.out.println("----------Let's Calculate! ^-^----------");
    System.out.println("- : subtract, + : add , * : multiply, / : divide, ! : exit");
    System.out.println("-----------------------------------");
    System.out.println("Enter the operator for the operation you want: ");
     op = scanner.next().charAt(0);
     if (op == '!'){ 
        System.out.println("Goodbye ^-^");
        again = false;
        return;
     }
     System.out.println("Enter two Numbers separated by a space: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        
            
        

    switch (op){

        case '-':
            System.out.println(num1 - num2);
            break;
        case '+':
            System.out.println(num1 + num2);
            break;
        case '*':
            System.out.println(num1 * num2);
            break;
        case '/':
            if ( num2 == 0){System.out.println("Enter a number greater or less than 0!"); continue;}
            System.out.println((double)num1 / num2);
            break;

        default:
            System.out.println("Enter a valid operator");

    }
    
 } while(again);

}

}

public class Calculator{

    public static void main(String[] args){

        Calculate obj = new Calculate();

        obj.Calc();
        
    }
}