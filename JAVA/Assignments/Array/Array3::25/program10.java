



		// write a Program to print product of prime element in an array.
	

		class ProductPrimeNo{

                public static void main(String[]args){

                int arr[] = new int[]{1,4,5,6,11,9,10};

		int product = 1;

                for(int num : arr){

                if(isPrime(num)){

		product = product * num;
			
		}
		}

                System.out.println(product + " ");
               
                }

                public static boolean isPrime(int num){

                if(num <= 1)return false;

                for(int i = 2 ; i < num; i++){

                if (num % i == 0) return false;
                }

                return true;
                }
                }
