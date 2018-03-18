package headFirst.Factory.Abstract.AbstractPizzaStore;

import headFirst.Factory.Abstract.Pizza.AbstractPizza;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:34:41
* @ClassName 类名称
* @Description 类描述
*/
public abstract class AbstractPizzaStore {
     
	public AbstractPizza orderPizza(String type){
		AbstractPizza  pizza = createPizza(type);
		pizza.getName();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract AbstractPizza createPizza(String type); 
	
	
}
