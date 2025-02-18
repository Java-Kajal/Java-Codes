


		// WAP to print the occurence of usr given program.		



		import java.util.*;

                class OccuranceOfCharacter{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter size of Array : ");

                int size = sc.nextInt();

                char arr[] = new char[size];

                System.out.println("Enter Element in an array : ");

                for(int i = 0; i < size; i++){

                arr[i] = sc.next().charAt(0);

                }
		int count = 0;
			
		 System.out.println("Enter the character to check : ");
		  
		 char k = sc.next().charAt(0);

			for(char c : arr){

				// char ch = Character.toLowerCase(c);
			
					if (c == k){

						count ++;
				}
			}
			System.out.println(k + " Occurs " + count + " times in the array ");
		}
		}
