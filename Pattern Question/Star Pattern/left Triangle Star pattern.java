import java.util.Scanner;
class leftstarpattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=2*(row-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;i<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}