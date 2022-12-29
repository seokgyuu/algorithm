import java.util.Scanner;

public class x만큼간격이있n개의숫자 {
	class Solution {
	      public long[] solution(long x, int n) {
	          long[] answer = new long[n];
	          
	          for(int i=0; i<n; i++) {
	              answer[i] += x + x*i;
	          }
	         
	          
	          return answer;
	      }
	    }
}
		

