



		 // Program 1


		class Demo{
			
			void fun(Object x){
			
				System.out.println("In fun");
			}
		}
			
			class Outer{
			
				public static void main(String[]args){
				
					Demo obj = new Demo();

					obj.fun(10);

					//obj.fun(new Integer(10));
				}
			}
