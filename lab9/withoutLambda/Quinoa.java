package strategycustomburger;

public class Quinoa implements BurgerCharges {

	public Quinoa() 
	{
		
	}

	@Override
	public double BurgerCharge(double burgerprice) {

		System.out.println("Quinoa Charges");

		double burgercharge = burgerprice + 5;
		
		return burgercharge;
		
	}
}
