package headFirst.Factory.Abstract.AbstractPizzaStore.impl;

import headFirst.Factory.Abstract.AbstractPizzaStore.AbstractPizzaStore;
import headFirst.Factory.Abstract.FactoryImpl.PizzaFactory;
import headFirst.Factory.Abstract.FactoryImpl.impl.NyPizzaFactory;
import headFirst.Factory.Abstract.Pizza.AbstractPizza;
import headFirst.Factory.Abstract.Pizza.impl.NyStylePizza;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:36:56
* @ClassName 类名称
* @Description 类描述
*/
public class NyAbstractStore extends AbstractPizzaStore  {

	
	@Override
	public AbstractPizza createPizza(String type) {
		NyStylePizza nyStylePizza = null;
		PizzaFactory pizzaFactory = new NyPizzaFactory();
		if(type.equals("cheese")){
			nyStylePizza = new NyStylePizza(pizzaFactory);
			nyStylePizza.setName("cheese Pizza");
		}
		return nyStylePizza;
	}

}
