


		
                // WAP to check if an array is palindrome or not.

                import java.util.*;

                class PalindromeNo{

                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

				boolean isPalindrome = true;

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();

                                }
				for(int i =0; i<size/2;i++){
				
					if(arr[i] != arr[size-1-i]){
					
						isPalindrome = false;
							break;
					}
				}
				if(isPalindrome){
				
					System.out.println("The given array is Palindrime");
				}else
					System.out.println("The given array is not palindrome");
			}
		}
