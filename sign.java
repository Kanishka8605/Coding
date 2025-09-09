import java.util.Scanner;
class sign{
    public static void main(String args[]){
        Scanner ojc = new Scanner (System.in);
        int b=ojc.nextInt();
        if(b>=0)
        System.out.println("Positive");
        else
        System.out.println("Negative");
    }
}