import java.util.Scanner;

public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		System.out.println("n값을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i < n; i++) {
			if(n%i==1) {
				System.out.println(i);
			}
			}
	}

}
