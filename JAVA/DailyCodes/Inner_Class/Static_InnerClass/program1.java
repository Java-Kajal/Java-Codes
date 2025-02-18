




	// Program 1
	


		class Outer{
			static int x =10;
			int y =20;
			static void run(){
				System.out.println("In Static Method");
			}
			void fun(){
			System.out.println("In non static Method");
			}

			static class Inner{
				Inner(){
				System.out.println(x);
				run();
			}
			}

			public static void main(String[]args){
			Outer.Inner obj = new Outer.Inner();
			}
		}
