//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        for(int i=1; i<=a; i++)
            sum+=i;
    System.out.print(sum);
    }
}
