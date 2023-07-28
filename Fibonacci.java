import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int num1 = 0;
		int num2 = 1;
		int res = 0;
		System.out.println(num1);
		System.out.println(num2);
		do {
			res = num1 + num2;
			System.out.println(res);
			num1 = num2;
			num2 = res;
			i++;
		}while(i < 20);
	}

}

