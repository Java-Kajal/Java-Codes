	


		// Write a program to find the first Occurence of specific number in an array. print the index of first occurence.
		
			

		import java.util.*;

		class ArrayOccurenceNo{
		
		public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[]{1,5,9,8,7,6};
		
		System.out.println("Enter the number : ");
	
		int number = sc.nextInt();

		int N = 6;

		int index = -1;

		for(int i =0; i<N; i++){
		
			if(number == arr[i]){
			
				index = i;
				break;
		}
		}
			if(index != -1){
			
			System.out.println("Num "+ number + " first occured at index " + index);

			}
			else{
			
			System.out.println("Num " + number + " not found in array ");
				}
			}
		}
