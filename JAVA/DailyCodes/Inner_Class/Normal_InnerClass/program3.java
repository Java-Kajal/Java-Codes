



	// Program 3 - Static & NonStatic Access in Inner class from Outer clas
	


	class Outer{
		int x = 10;
		static int y = 20;
		Outer(){
		System.out.println("In Outer Constructor");
		}
		class Inner{
		Inner(){
		System.out.println("In Inner Constructor");
		System.out.println(x);
                System.out.println(y);

		}
		}
		public static void main(String[]args){
			Outer outobj1 = new Outer();
			Inner obj = outobj1.new Inner();
		}
	}
