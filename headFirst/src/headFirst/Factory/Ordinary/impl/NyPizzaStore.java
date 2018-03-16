package headFirst.Factory.Ordinary.impl;

import headFirst.Factory.Ordinary.Pizza;
import headFirst.Factory.Ordinary.PizzaStore;

/**
* @author wudi
* @version 创建时间：2018年3月16日 下午11:23:27
* @ClassName 类名称
* @Description 类描述
*/
public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("nycheese")){
			Pizza pizza = new NyPizza();
			return pizza;
		}
		return null;
	}

}
