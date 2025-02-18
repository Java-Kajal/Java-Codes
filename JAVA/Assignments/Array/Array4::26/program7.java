



		// WAP to convert lowecase character to uppercase character .


		import java.util.*;

                class ConvertLowertoUpper{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter size of Array : ");

                int size = sc.nextInt();

                char arr[] = new char[size];

                System.out.println("Enter Element in an array : ");

                for(int i = 0; i < size; i++){

                arr[i] = sc.next().charAt(0);

                }
		for( int i = 0; i< size; i++){
		
			if(arr[i] >= 'a' && arr[i]<= 'z'){
		
				arr[i] = (char)(arr[i] - 32);
		}

		System.out.println( arr[i] );
		
		}
		}
		}

