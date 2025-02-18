


		// Write a Program to print all the consonant in an array .



		class ArrayConsonant{
		
		public static void main(String[]args){
		
		char arr[] = new char[]{'a','b','c','y','x','o','p'};

		char N = 7;

		System.out.println("Consonant in the aray are");

		for(char i : arr){
		
		if(isConsonant(i)){
		
		System.out.println(i + " ");

		}
		}
		}

		public static boolean isConsonant(char i){
		
		i = Character.toLowerCase(i);

		return i >= 'a' && i <= 'z' && !(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u');
		}
		}

