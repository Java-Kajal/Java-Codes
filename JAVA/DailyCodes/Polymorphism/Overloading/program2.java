


		// Program 2
		


		class Demo{
		
			void fun(int x, int y){
			
				System.out.println("int-int");
			}


			void fun(int x, float y){

				System.out.println("int-float");
		       }
			
			void fun(float x, int y){

				System.out.println("float-int");
			}

			void fun(float x, float y){
			
				System.out.println("float-float");
			}

			public static void main(String[]args){
			
				Demo obj = new Demo();

				obj.fun(10,20);

				obj.fun(10,20.5f);

				obj.fun(10.5f,20);

				obj.fun(20.5f,10.5f);

				obj.fun('A',10);

			}
		}
