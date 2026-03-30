import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();
        char c=' ';
        c=a.charAt(b-1);
        System.out.print(c);
    }
}