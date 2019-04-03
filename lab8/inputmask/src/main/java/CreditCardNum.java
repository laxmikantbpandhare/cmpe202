/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	IdecorateValue wrapped;
	private IKeyEventHandler nextHandler ;
	private String number = "" ;
//	private int i=0;
	
	   public void wrapDecorator( IdecorateValue w ) 
	   {
	       this.wrapped = w ;
	   }

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}
	
	
    public String removeLastChar(String string) {
        return string.substring(0,string.length()-1);
    }

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
		{	
			if(ch.equals("X") && number.length()>0){
				number = removeLastChar(number);
				System.out.println("Coming here"+ch);
			}
			else
				if(ch.equals("X") && number.length()==0){
					;
				}
			else
				number += ch ;
			
			/* the below solution which I tried is hard coded one*/
			/* this will only apply to the card with 4 in length and if we tried to add
			 * 6 digit card then it will be very difficult which violates the SOLID principle*/
			
//			if(i>3){
//				number += " ";
//				i=0;
//			}
//			
//			if(i<4)
//			{	
//			  number += ch ;
//			  i++;
//			}
			
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}