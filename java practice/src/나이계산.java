import java.util.Scanner;

public class 나이계산 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요");
		int year = scanner.nextInt();
		
		System.out.print("나이의 종류를 입력하세요(korea or year)");
		String type = scanner.next();
		
		int age2030 = calculateAge2030(year, type);
		
		System.out.print("2030년에 " + type + "로 계산한 나이: " + age2030 + "살");
	}


		private static int calculateAge2030(int year, String type) {
			
			int currentYear = 2030;
			
			//equalsIgnoreCase 문자열 비교
			if("korea".equalsIgnoreCase(type)) {
				
				return currentYear - year + 1;
	        } 
			
			else if("Year".equalsIgnoreCase(type)) {
	            
				return currentYear - year;
				        } 
			else 
				
				return 0;
		}
		}
