import java.util.Scanner;
class num3{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
int temp=n;
int step=0;
while(n>0){
    n/=10;
    step++;
}
int div=(int)Math.pow(10,step-1);
while(div>0);
int dig=(temp/div)%10;
System.out.println(dig);
div/=10;
}
}