import java.util.Scanner;
class mirror{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number row");
        int row=sc.nextInt();
        int s=row-1;
        int st=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++)
            {
                System.out.print("*");
            }

            s=s-1;
            st+=1;
            System.out.println("");
        }

    }
}