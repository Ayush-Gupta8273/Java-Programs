
import java.util.Scanner;
class Ayush{
    public static void main(String[] args){
        int num1;

        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        num1=scanner.nextInt();

       if(num1==0){
        System.out.println("zero");
       
        if(num1!=0 && num1 % 2==0){
                System.out.println("Number is even");
        }
        else{
                System.out.println("number is odd");
            }
        
        
            }
        }
}