package headFirst.Factory.Ordinary;
/**
* @author wudi
* @version 创建时间：2018年3月16日 下午11:13:28
* @ClassName PizzaStore
* @Description 披萨店
*/
public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
