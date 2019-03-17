
public class OrderPrint implements PrintReceiptInterface{
	String key[];
	OrderPrint(String display){
		key = new String[10];
		System.out.println(display);
	}

	@Override
	public void print_receipt(String array[], double value[],double tax) {
		for(int i=0;i<7;i++)
		{	
			if(value[i]!=0){
				key[i] = array[i] + "                      " +String.valueOf(value[i]);
			}
			else{
				key[i] = array[i];
			}
			System.out.println(key[i]);
			

		}
		System.out.println("\n");
		System.out.printf("Tax:                    ",tax);
		System.out.println(tax);
		
	}

}
