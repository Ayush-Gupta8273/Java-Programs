import java.util.*;
class Example{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the NUmber");
        num=sc.nextInt();
        int tem=num;
        int rev=0;
        int sum=0;
        while(num>10){
            rev=num%10;
            sum=(sum*10)+rev;
            num=num/10;

        }
        if(tem==sum){
               System.out.println(tem+" "+"Number is palindrome");

        }
        else{
            System.out.println(tem+" "+"THe number is not Palindrome");
        }
    }
}