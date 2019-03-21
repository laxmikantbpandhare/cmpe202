public class Sauce extends LeafDecorator
{
    private String[] options ;
    private int count;
    
    public Sauce( String d )
    {
        super(d) ;
    }
    
    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
            
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Thai Peanut Sauce".equals(options[i]) ) {
             this.price += 0.50 ;
            count = count + 1;}
        }
        
        int val = (options.length-count);
         if ( val > 1 )
            this.price += (options.length-1) * 0.75 ;
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