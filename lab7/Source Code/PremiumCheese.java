
/**
 * Write a description of class PremiumCheese here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumCheese extends LeafDecorator
{
    // instance variables - replace the example below with your own
   private String[] options ;

    /**
     * Constructor for objects of class PremiumCheese
     */
    public PremiumCheese(String d)
    {
        // initialise instance variables
        super(d);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
            this.price += (options.length) * 1.50 ;
    }
    
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}
