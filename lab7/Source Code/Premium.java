public class Premium extends LeafDecorator
{
    private String[] options ;
    private int count;
    
    
    public Premium( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
         
          
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Marinated Tomatoes".equals(options[i]) ) {
              this.price += 3.00 ;
              count = count + 1;    
            }
        }
            
        int val = (options.length-count);
          if(val>0)
            this.price += val * 1.50 ;

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