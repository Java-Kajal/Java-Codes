


		// Range Sum

		import java.util.*;
		class RangeSum{
		
		public static void main(String[]args){
		
		int arr[] = new int[]{2,5,3,11,7,9,4};

		int N = 7;
		int sum = 0;
		
		Scanner sc = new Scanner (System.in);

		int startIndex = sc.nextInt();
		int endIndex = sc.nextInt();

		for(int i = startIndex; i<=endIndex; i++){
		
			sum = sum+arr[i];
		}
		System.out.println(sum);
		}
		}

		// Time Complexity = O(N)
		// Space Complexity = O(1)
