



		// Calculate Profit and Loss

				

		class ProfitLoss{
			
			public static void main(String[]args){
			
				int sellingPrice = 300;
				int costPrice = 500;
				
				if(sellingPrice > costPrice){
					
					System.out.println("Profit of : " + (sellingPrice - costPrice));
				}
				else if (sellingPrice < costPrice){
					
					System.out.println("Loss of : " + (costPrice - sellingPrice));
				}
				else{
				
					System.out.println("No Profit and No Loss");
				}
			}
		}
