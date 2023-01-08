
public class 내적 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {-3,-1,0,2};
		int[] arrResult = new int[a.length];
		for(int i =0; i<a.length; i++) {
			arrResult[i] +=a[i] * b[i];
			System.out.println(arrResult[i]+"");
		}
		
	}

}
