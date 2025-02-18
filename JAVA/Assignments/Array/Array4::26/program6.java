



		// WAP to count the vowels and consonent in the array.

		
		import java.util.*;

		class CountOfVowels{
		
		public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");

		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter Element in an array : ");

		for(int i = 0; i < size; i++){
		
		arr[i] = sc.next().charAt(0);
			
		}
		int vowelCount = 0;
		int consonantCount = 0;

		for(char c : arr){

		char ch = Character.toLowerCase(c);
		
		if(ch >= 'a' && ch <= 'z'){

		if(ch =='a'|| ch == 'e'||ch =='i'||ch =='o'||ch =='u'){
		
		vowelCount ++;
		
		}else{
			consonantCount ++;
		}
		} 
		}

		System.out.println("Count of vowel : " + vowelCount);
		System.out.println("Count of consonants : " + consonantCount);
		}
		}
