/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	//private int i = 0;
	IdecorateValue wrapped;
	
	
	public void wrapDecorator( IdecorateValue w ) 
	{
	    this.wrapped = w ;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[]" + "  " ;
		else
			return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
		{
			
			
			if(ch.equals("X") && date.length()>0){
				date = removeLastChar(date);
				System.out.println("Coming here"+ch);
			}
			else
				if(ch.equals("X") && date.length()==0){
					;
				}
			else
				date += ch ;
//			if ( ch.equals(" ") )
//				;
//			else if(ch.equals("X"))
//			{
//				ch = removeLastChar(ch);
//			}
//			else
//			{
//					if(i>1){
//						date += "/";
//						i=0;
//					}
//			
//					if(i<2)
//					{
//						date += ch ;
//						i++;
//					}
//			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
    /**
     * Key Event Update
     * @param string   Count of Keys So Far
     * @return Count of Keys So Far
     */   
    public String removeLastChar(String string) {
        return string.substring(0,string.length()-1);
    }

}