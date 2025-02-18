

		// WAP to print the cagracter in an array which come before the user given chharacter

		
                import java.util.*;

                class keycharacter{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter size of Array : ");

                int size = sc.nextInt();

                char arr[] = new char[size];

                System.out.println("Enter Element in an array : ");

                for(int i = 0; i < size; i++){

                arr[i] = sc.next().charAt(0);

                }

		System.out.println("Enter character key : ");
		
		char key = sc.next().charAt(0);
		
		System.out.println("Character before " + key + ":");

		for(char c : arr){
		
		if(c == key){
		
			break;
		}
		System.out.println(c + " ");
		}
		}
		}
