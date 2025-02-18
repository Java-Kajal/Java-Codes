



	// Program 4
	


		class Outer{
			Outer(){
			System.out.println("In Outer Constructor");
			}

			class Inner{
				Inner(){
				System.out.println("In Inner Constructor");
				}
			}

			public static void main (String[]args){
				Outer outObj = new Outer();
				Inner Obj = outObj.new Inner();
			}
		}
