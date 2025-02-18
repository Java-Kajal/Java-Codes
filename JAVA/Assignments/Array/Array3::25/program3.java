


		
		// Writw a Program to find the number of occurence of a specific number in an array. print the count of occurence.


		import java.util.*;
		
                class ArrayOccurenceNo{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[]{2,5,2,7,8,9,2};

                System.out.println("Enter the number : ");

                int number = sc.nextInt();

		int count = 0;

                int N = 7;

                for(int i =0; i<N; i++){

                        if(number == arr[i]){

                                count ++ ;
                                
                }
                }
                        if(count > 0){

                        System.out.println("Num "+ number + " occured " + count +" times in an array");

                        }
                        else{

                        System.out.println("Num " + number + " not found in array ");
                                }
                        }
		}
