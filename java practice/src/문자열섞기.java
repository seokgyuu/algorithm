
public class 문자열섞기 {

	public static void main(String[] args) {
		
		String str1 = "aaaa";
		String str2 = "bbbb";
		String answer = "";
		
		for(int i=0; i< str1.length(); i++) {
			answer += str1.substring(i,i+1);
			answer += str2.substring(i,i+1);
		}
		
		System.out.println(answer);
		
	}

}
