import java.util.Scanner;
class primenumber2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the SEcond Number");
        int num2 =sc.nextInt();
        for(int i=num1;i<=num2;i++){
            if(prime(i))
            {
                System.out.print(i+" ");
            }
        }

    }
    public static boolean prime(int n)
    {
        if(n<=1){
            return false;     
               }
               for(int i=2;i<=Math.sqrt(n);i++)
               {
                if(n%2==0){
                return false;
               }
            }
            return true;
    }
}
