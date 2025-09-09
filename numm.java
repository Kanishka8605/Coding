import java.util.Scanner;
class numm{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
}