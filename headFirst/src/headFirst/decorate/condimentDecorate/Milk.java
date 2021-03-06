package headFirst.decorate.condimentDecorate;

import headFirst.decorate.Beverage;

public class Milk extends BeverageModule {
    private Beverage beverage;
	
    public Milk(Beverage beverage){
    	this.beverage = beverage;
    }
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Milk";
	}

	@Override
	public double cost() {
		double cost = beverage.cost()+0.3;
		if(getSize().equals("tall")){
			cost+=0.8;
		}else if(getSize().equals("middle")){
			cost+=0.5;
		}else if(getSize().equals("small")){
			cost+=0.3;
		}
		return cost;
	}

	@Override
	public String getSize() {
		size = beverage.getSize();
		return size;
	}

}
