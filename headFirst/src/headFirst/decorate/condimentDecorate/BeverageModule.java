package headFirst.decorate.condimentDecorate;

import headFirst.decorate.Beverage;

/**
 * 抽象装饰者
 * @author Administrator
 *
 */
public abstract class BeverageModule extends Beverage {

	public abstract String getDescription();
	
	public abstract String getSize(); //大小
	
	

}
