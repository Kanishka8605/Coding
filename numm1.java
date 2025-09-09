import java.util.Scanner;
class numm1{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int dig=0;
        while(a>0){
           dig=a%10;
           System.out.print(dig);
           a=a/10;
        }
    }
}