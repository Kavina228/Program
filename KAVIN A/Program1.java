import java.util.Scanner;
class Calculator {
    double a;
    double b;
    Calculator(double a, double b) {
        this.a=a;
        this.b=b;
    }
    double add() {
        return a+b;
    }
    double subtract() {
        return a-b;
    }
    double multiply() {
        return a*b;
    }
    double divide() {
        if (b==0) {
            System.out.println("Error: Division by zero Not Possible!");
            return Double.NaN;
        }
        return a/b;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a=sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b=sc.nextDouble();
        System.out.print("Enter the operation \n add \n subtract \n multiply \n divide\n ");
        String operation=sc.next();
        Calculator calc=new Calculator(a,b);
        double result=0;
        switch (operation.toLowerCase()) {
            case "add":
                result=calc.add();
                break;
            case "subtract":
                result=calc.subtract();
                break;
            case "multiply":
                result=calc.multiply();
                break;
            case "divide":
                result=calc.divide();
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        System.out.println("Result: "+result);
    }
}
