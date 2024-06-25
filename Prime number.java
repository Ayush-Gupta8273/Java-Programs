import java.util.Scanner;
class primenumber{
    public static void main(String[] args) {
        int n,i,m,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"Number is not prime");
        }
        else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }

}