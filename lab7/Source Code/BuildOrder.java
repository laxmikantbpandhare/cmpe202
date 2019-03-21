  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Beef", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Danish Blue Cheese", "Horseradish Cheddar" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( c ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Applewood Smoked Bacon" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Appricot Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }
    
    
    public static Component getSecondOrder()
    {
        Composite order = new Composite( "\n\nOrder\n\n" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;//12 and 4
        b.setOptions( bo ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;//1
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        //
        PremiumCheese c1 = new PremiumCheese( "Premium Cheese Options" ) ;//1.5
        String[] co1 = { "Danish Blue Cheese" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( c ) ;
        
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;//nothing
        t.setOptions( to ) ;
        t.wrapDecorator( c1 ) ;
        
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;//3
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        //
        Bun b1 = new Bun( "Bun Options" ) ;
        String[] bo1 = { "Ciabatta (Vegan)" } ;
        b1.setOptions( bo1 ) ;
        b1.wrapDecorator( p ) ;
        
        Side s1 = new Side( "Side Options" ) ;//3
        String[] so1 = { "Shoestring Frice" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( b1 ) ;
        
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;//0.75
        String[] so = { "Mayonnaise", "Thai Peanut Sauce"} ;
        s.setOptions( so ) ;
        s.wrapDecorator( s1 ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( c1 ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( b1 ) ;
        customBurger.addChild( s1 ) ;
        
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;  
    }
    
    
    public static Component getThirdOrder()
    {
        Composite order = new Composite( "\n" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;//9 for 1.3lb.
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Smoked Gouda", "Greek Feta" } ;//1
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //
        PremiumCheese c1 = new PremiumCheese( "Premium Cheese Options" ) ;//1.5
        String[] co1 = { "Fresh Mozzarella" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( c ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;//0
        String[] to = { "Creshed Peanuts" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( c1 ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;//1.5+3
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        //
        Bun b1 = new Bun( "Bun Options" ) ;//1
        String[] bo1 = { "Gluten-Free Bun" } ;
        b1.setOptions( bo1 ) ;
        b1.wrapDecorator( p ) ;
        
        Side s1 = new Side( "Side Options" ) ;//3
        String[] so1 = { "Shoestring Frice" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( b1 ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;//0
        String[] so = { "Habanero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( s1 ) ;

        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( c1 ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( b1 ) ;
        customBurger.addChild( s1 ) ;
        
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/