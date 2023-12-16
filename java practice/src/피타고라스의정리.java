import java.util.Scanner;

public class 피타고라스의정리 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a의 값을 입력해주세요");
		int a = scanner.nextInt();
		
		System.out.print("c값을 입력해주세요");
		int c = scanner.nextInt();
		
		int b_square = calculateBSquare(a,c);
		
		System.out.print("b=" + b_square);
	}



	private static int calculateBSquare(int a , int c) {
		
		return c*c -a*a ;
	}
	}
