import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Math m=new Math();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to calculator. Please choose number of operation you want to perform");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Square");
        System.out.println("6. Cube");

        int operation=scanner.nextInt();

        switch (operation){

            case 1:
                System.out.println("Enter first number ");
                int a=scanner.nextInt();
                System.out.println("Enter second number ");
                int b=scanner.nextInt();

                System.out.println("Result :"+m.add(a,b));
                break;

            case 2:
                System.out.println("Enter first number ");
                a=scanner.nextInt();
                System.out.println("Enter second number ");
                b=scanner.nextInt();

                System.out.println("Result :"+m.sub(a,b));
                break;

            case 3:
                System.out.println("Enter first number ");
                a=scanner.nextInt();
                System.out.println("Enter second number ");
                b=scanner.nextInt();

                System.out.println("Result :"+m.div(a,b));
                break;

            case 4:
                System.out.println("Enter first number ");
                a=scanner.nextInt();
                System.out.println("Enter second number ");
                b=scanner.nextInt();

                System.out.println("Result :"+m.mult(a,b));
                break;

            case 5:
                System.out.println("Enter number ");
                a=scanner.nextInt();


                System.out.println("Result :"+m.sq(a));
                break;

            case 6:
                System.out.println("Enter number ");
                a=scanner.nextInt();

                System.out.println("Result :"+m.cube(a));
                break;

            default:
                System.out.println("Please select appropriate operation.");
                break;
        }

    }
}
