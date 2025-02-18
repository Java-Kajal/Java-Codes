



		// program 3    Error Ambiguty



		class Demo{
		
			void fun(int x, float y){
			
				System.out.println("int-float");

			}

			void fun(float x, int y){
			
				System.out.println("float-int");
			}

			public static void main(String[]args){
			
				Demo obj = new Demo();

				obj.fun(10,20);
			
			}
		}
