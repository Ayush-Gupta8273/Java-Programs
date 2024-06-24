import java.util.Scanner;
class Ayush{
    public static void main(String[] args) {
    int num1;
    int num2;

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    num1=sc.nextInt();

    System.out.println("Enter the Second Number");
    num2=sc.nextInt();

    num1=num1^num2;
    num2=num1^num2;
    num1=num1^num2;

    System.out.println(num1);
    System.out.println(num2);
    
    }

    private static void elseif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}