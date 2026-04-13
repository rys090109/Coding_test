import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        int c=sc.nextInt(); 

        int total = b + c;

        a = (a + total / 60) % 24;
        b = total % 60;   

        System.out.print(a+" "+b);
    }
}