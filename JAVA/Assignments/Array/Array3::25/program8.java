	



		// Print the Composite numbers in an array.


		class  CompositeNo{
		
		public static void main(String[]args){
		
		int arr[] = new int[]{4,5,7,9,10};

		for(int num : arr){
		
		if(isComposite(num) ){
		
		System.out.println(num + " ");
		
		}
		}
		}
		
		public static boolean isComposite(int num){
		
			if(num <= 1)return false;

			int count = 0;

			for (int i = 1; i <= num; i++ ){
			
				if(num % i == 0){
				
				count++;
			}
			if(count>2) return true;
		}
		return false;
		}
		}
