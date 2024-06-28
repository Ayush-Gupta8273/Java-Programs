import java.util.Scanner;
 class reversepattren{
    public static void mian(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int sp=row-1;
        int st=1;
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                
                    System.out.print("* ");
                
        }
           System.out.println("");
    }
    }
}