package headFirst.Factory.Ordinary;

import headFirst.Factory.Ordinary.impl.NyPizzaStore;

/**
* @author wudi
* @version 创建时间：2018年3月16日 下午11:26:38
* @ClassName 类名称
* @Description 类描述
*/
public class OrdinaryTest {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NyPizzaStore();
		Pizza nyPizza = nyPizzaStore.orderPizza("nycheese");
	}
	
	
}
