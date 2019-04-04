/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 )
			{
				
				if(ch.equals("X") && cvc.length()>0){
					cvc = removeLastChar(cvc);
					System.out.println("Coming here"+ch);
				}
				else
					if(ch.equals("X") && cvc.length()==0){
						;
					}
				else
					cvc += ch ;
			}
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
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