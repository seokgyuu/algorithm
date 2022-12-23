import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력:");
			int n = sc.nextInt();
			int cnt = 0;
			System.out.println(n+"약수 구하기:");
			for (int i=1; i<= n; i++) {
				if(n % i==0) {
					System.out.println(i+"");
				cnt++;
				}
			}
			System.out.println("");
			System.out.println("약수의 개수:"+cnt);
		}

	}
