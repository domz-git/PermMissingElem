
public class Main {

	public static void main(String[] args) {
		int[] A = new int[]{5,7,8,9,10};
		System.out.print(" - "+solution(A));
		
	}
	
	public static int solution(int[] A) {
		int c = 0;
		int temp;
		
		
		
		for(int i=0;i<A.length;i++) {
			for(int j=i+i;j<A.length;j++){
				if(A[i]>A[j]){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		
		c=A[0];
		
		for(int j=0;j<A.length;j++){
			
			System.out.print(A[j]);
		}
		
		for(int j=1;j<A.length;j++){
			if(c+1 != A[j]) {
				return c+1;
			}
			c++;
		}
		return 0;
	}

}
