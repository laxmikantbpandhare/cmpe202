
public class customburger {

	
	public static void main(String args[])
	{
		addlist addlist = new addlist(new OrderPrint("Now Printing Order Receipt"));

		System.out.println("---------------------------------\n");
		
		addlist.add("1    LBB",5.59);
		addlist.othersubitems("       {{{{ BACON }}}}");//(8 se 3)
		addlist.othersubitems("       LETTUCE");
		addlist.othersubitems("       TOMATO");
		addlist.othersubitems("       ->|G ONION");
		addlist.othersubitems("       ->| JALA GRILLED");
		addlist.add("1    LTL CAJ",2.79);
		addlist.taxcalculate();
		

		addlist.performprintoperation();
		
		addlist packingslip = new addlist(new packingslip("\n\nNow Printing Packing Receipt"));
		System.out.println("---------------------------------\n");
		
		packingslip.add("1    LBB",5.59);
		packingslip.othersubitems("       {{{{ BACON }}}}");
		packingslip.othersubitems("       LETTUCE");
		packingslip.othersubitems("       TOMATO");
		packingslip.othersubitems("       ->|G ONION");
		packingslip.othersubitems("       ->| JALA GRILLED");
		packingslip.add("1  LTL CAJ",2.79);
		packingslip.taxcalculate();
		
		packingslip.performprintoperation();
		
	}
}
