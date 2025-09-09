import java.util.Scanner;
class patt3{
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int n=abc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(i==j||i==n||j==1)
            System.out.print("*");
            else
            System.out.print(" ");
            }
        System.out.println();
        }
        
    }
}