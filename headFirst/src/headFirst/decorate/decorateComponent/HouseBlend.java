package headFirst.decorate.decorateComponent;

import headFirst.decorate.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 1.0;
	}

}
