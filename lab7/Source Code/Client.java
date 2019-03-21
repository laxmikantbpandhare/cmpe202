  

public class Client {

    public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();
        
        theOrder = BuildOrder.getSecondOrder() ;
        theOrder.printDescription();
         
        theOrder = BuildOrder.getThirdOrder() ;
        theOrder.printDescription();

    }
}
 
