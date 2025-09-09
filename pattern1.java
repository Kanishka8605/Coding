import java.util.Scanner;
class pattern1{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1||row==n||col==1||col==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}