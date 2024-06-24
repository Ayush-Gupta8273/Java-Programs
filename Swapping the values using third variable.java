import java.util.Scanner;
class GFG{
    public static void main(String args[])
    {
        int num1;
        int num2;
        int temp = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number1");
        
        num1=sc.nextInt();
         System.out.println("Enter the Number2");
        num2=sc.nextInt();

        temp=num1;
         num1=num2;
        num2=temp;
        
    
        System.out.println(num1);
        System.out.println(num2);
    }
}