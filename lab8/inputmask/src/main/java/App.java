/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;
    private addSlash addslash;
    private addSpace addspace;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);
        
        /* referred custom burger problem where wrapDecorator will be called while wrapping
         * all the objects */
        
        num.wrapDecorator(addspace);
        exp.wrapDecorator(addslash);
        
        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	
        if(ch.equals("X") && count > 0){
        	count--;
        	screen.key(ch, count);
        }
        else
        {
        	count++;	
        	screen.key(ch, count);
        }
        
        /* check for counter if ch is X then reduce it*/

    }

}

