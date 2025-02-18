



		// WAP to print sum of even and odd numbers in an array.

                import java.util.*;

                class EvenOdd{

                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();

                                }
				int oddsum = 0;
				int evensum = 0;

				for(int i = 0; i<size; i++){
				
					if(arr[i] % 2==0){
						
						evensum = (evensum + arr[i]);

					}else{
						oddsum = (oddsum + arr[i]);

					}
				}
				 System.out.println("Even Sum : " + evensum);
				 System.out.println("Odd Sum : " + oddsum);
			}

		}
