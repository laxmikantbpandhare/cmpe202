


public class addlist {

	private  PrintReceiptInterface printreceipt;
	String order_history[];
	double price_history[];
	int i=0;
	double sum,tax;
	
	addlist(){
		
	}
	
	addlist(PrintReceiptInterface printreceipt){
		order_history = new String[10];
		price_history = new double[10];
		this.printreceipt=printreceipt;
	}
	
	public void add(String s,double d){
		order_history[i] = s;
		price_history[i] = d;
		sum = sum + d;
		i = i+1;
	}


	public void othersubitems(String s) {
		// TODO Auto-generated method stub
		
		order_history[i] = s;
		i = i+1;
		
		
	}

	
	public void performprintoperation(){
		printreceipt.print_receipt(order_history,price_history,tax);
	}

	public void taxcalculate() {
		tax = (0.09)*sum;
	}

}
