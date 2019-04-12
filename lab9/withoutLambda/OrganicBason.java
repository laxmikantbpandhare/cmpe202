package strategycustomburger;

public class OrganicBason implements BurgerCharges {

	public OrganicBason() 
	{
		
	}

	@Override
	public double BurgerCharge(double burgerprice) {

		System.out.println("Organic Bason Charge");

		double burgercharge = burgerprice + 4;
		
		return burgercharge;
	}
}
