package strategycustomburger;

public class HousemadeVeganVeggie implements BurgerCharges {

	public HousemadeVeganVeggie() 
	{
		
	}

	@Override
	public double BurgerCharge(double burgerprice) {

		System.out.println("House made Vegan Veggie Charge");

		double burgercharge = burgerprice + 3;
		
		return burgercharge;
	}
	
}
