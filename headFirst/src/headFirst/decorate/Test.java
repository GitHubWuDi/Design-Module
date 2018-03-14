package headFirst.decorate;

import headFirst.decorate.condimentDecorate.Milk;
import headFirst.decorate.condimentDecorate.Soy;
import headFirst.decorate.decorateComponent.DarkRoast;

/**
 * 装饰者模式测试工作
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Beverage darkRoast = new DarkRoast();
		darkRoast.setSize("tall");
		Beverage milkAndSoy =  new Soy(new Milk(darkRoast));
		double cost = milkAndSoy.cost();
		String description = milkAndSoy.getDescription();
		System.out.println(description+":"+cost);
	}
	
}
