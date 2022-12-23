public class 두문자열비교 {

		public static void main(String[] args) {
			String[] strArray1 = new String[] {"choi","seok","gyu"};
			String[] strArray2 = new String[] {"choi","seok","gyu"};
			int count = 0;
			
			for(int i =0; i < strArray1.length; i++) {
				for(int j=0; j<strArray2.length; j++) { //length 문자열의 길이를 알고자 할때
					if (strArray1[i].equals(strArray2[j])) {
						count ++;
					}
			}
			}
			System.out.println(count);
		}
		}
		