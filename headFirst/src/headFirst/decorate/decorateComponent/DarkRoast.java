package headFirst.decorate.decorateComponent;

import headFirst.decorate.Beverage;

public class DarkRoast extends Beverage {

	
	public  DarkRoast() {
        description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 1.8;
	}

}
