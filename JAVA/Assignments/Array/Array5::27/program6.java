



		
                // WAP to find first prime numbers in an array.

                import java.util.*;

                class FirstPrimeNo{
			
			public static boolean isPrime(int num){

				if(num <= 1){
				
				return false;
				
				}
				for (int i= 2; i*i<num; i++){

					if(num % i ==0){
					
						return false;
					}
				
				}
				return true;
			}
                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();
				}


				for(int i = 0; i<size; i++){
				
					if(isPrime(arr[i])){
					
						System.out.println("First prime number found at index" + i);
					 	
						return;	
					}
				}

				System.out.println("Prime no. not found in array");
			}
		}
