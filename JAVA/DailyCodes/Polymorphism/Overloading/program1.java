



		// Program 1
		


		class Demo{
		
			void fun(int x){
			
				System.out.println("fun-int");
			}


			void fun(char x){
			
				System.out.println("fun-char");

		        }

			
			void fun(float x){
			
				System.out.println("fun-float");
			}
			public static void main(String[]args){
			
				Demo obj = new Demo();

				obj.fun(25);

				obj.fun('A');

				obj.fun(10.6f);
			}
		}
