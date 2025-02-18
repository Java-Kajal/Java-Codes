



		// Print prime no. in an array.


		class PrimeNo{
		
		public static void main(String[]args){
		
		int arr[] = new int[]{5,7,9,11,15,19,90};

		for(int num : arr){
		
		if(isPrime(num)){
		
		System.out.println(num + " ");
		}
		}
		}

		public static boolean isPrime(int num){
		
		if(num <= 1)return false;

		for(int i = 2 ; i < num; i++){
		
		if (num % i == 0) return false;
		}

		return true;
		}
		}
