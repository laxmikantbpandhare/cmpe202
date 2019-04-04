import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    
    Set<String> accept = new HashSet<String>(Arrays.asList(new String[] {"1", "2", "3","4", "5", "6","7", "8", "9", "0"}));


    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        addspace = new addSpace();
        addslash = new addSlash();
        
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
    	
        if(ch.equals("X") && (count > 0 && count<=23)){
        	screen.key(ch, count);
        	count--;
        }
        else if(count<=23)
        {
        	/* accept only numerics as a digit */
        	//if (ch.equals("1" OR "2"))//"1")// || ch == "2" || ch == "3" || ch == "4"  || ch == "5" || ch == "6" || ch == "7" || ch == "8" || ch == "9" || ch == "0"  )
        	if(accept.contains(ch))
        	{
        		count++;	
        		screen.key(ch, count);
        	}
        }
        
        /* check for counter if ch is X then reduce it*/

    }

}

