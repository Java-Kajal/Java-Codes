



		
                // WAP to replace the element with the # , which are not in the range of 'a to z' .



                import java.util.*;

                class Replace{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter size of Array : ");

                int size = sc.nextInt();

                char arr[] = new char[size];

                System.out.println("Enter Element in an array : ");

                for(int i = 0; i < size; i++){

                arr[i] = sc.next().charAt(0);

                }
		for(int i = 0; i < size ; i++){
		
			if(!(arr[i] >='a' && arr[i] <='z')){
			  
			arr[i] = '#';
			}
		}
		for(char c : arr){
		
		System.out.println(c + " ");
	       	}
		}
		}


