package strategycustomburger;

public class InaBowl implements BurgerCharges{

	public InaBowl() 
	{
		
	}

	@Override
	public double BurgerCharge(double burgerprice) {

		System.out.println("In a Bowl Charge");

		double burgercharge = burgerprice + 1;
		
		return burgercharge;
	}
}
