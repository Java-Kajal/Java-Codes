



		// WAP to to reverse the array (Take input from users).

		import java.util.*;

		class ReverseArray{
		
		public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of element : ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the element of an array : ");

		for(int i = 0; i< size; i++){
		
			arr[i] = sc.nextInt();
		}	
		
		System.out.println("Reverse Array : ");

		for(int i = size-1; i >= 0; i--){

			System.out.println(arr[i] + " ");
		
		
		}
		}
		}
