




		// WAP to accept three numbers and check whether they are pythagoren triplets or not .



		class Pythagorean{
		
			public static void main(String[]args){
				
				int a = 3; 
				int b = 4; 
				int c = 5;

				if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
					
					System.out.println("It is a Pythagorean Triplets");
				}else{
					System.out.println("Its not Pythagorean Triplets");
				}
			}
		}
