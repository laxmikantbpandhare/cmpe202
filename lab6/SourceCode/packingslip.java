
public class packingslip  implements PrintReceiptInterface{
	String key[];
	String final_string[];
	packingslip(String display){
		key = new String[10];
		final_string = new String[10];
		System.out.println(display);
	}
	@Override
	public void print_receipt(String array[], double value[],double tax) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<7;i++)
		{	
			if(value[i]!=0){
				key[i] = array[i] + "                      " +String.valueOf(value[i]);
			}
			else{
				key[i] = array[i];
			}
			 
			final_string[0] = key[0];
			
			if(key[i].charAt(7)=='L')
				final_string[1] = key[i];
			else if(key[i].charAt(7)=='T')
				final_string[2] = key[i];
			else if(key[i].charAt(7)=='-')
				final_string[i-1] = key[i];
			else if(key[i].charAt(7)=='{')
				final_string[5] = key[i];
			
			final_string[6] = key[6];

		}
		for(int i=0;i<7;i++)
		{	
			System.out.println(final_string[i]);
		}
		System.out.println("\n");
		System.out.printf("Tax:                    ",tax);
		System.out.println(tax);
		
	}

	}

