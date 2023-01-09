
public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		int sum =0;
		int arr[] = new int[17];
		int idx = 0;
		for(int i=13; i<=arr.length; i++) {
			if((i%2)==0) {
				sum = sum + i;
				arr[idx] = sum;
				System.out.println(sum);
			}
			else {
				sum = sum -i;
				arr[idx] = sum;
				System.out.println(sum);
			}
			idx ++;
		}
	}

}
