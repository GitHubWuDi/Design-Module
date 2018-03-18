package headFirst.Factory.Abstract;

import headFirst.Factory.Abstract.AbstractPizzaStore.AbstractPizzaStore;
import headFirst.Factory.Abstract.AbstractPizzaStore.impl.NyAbstractStore;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:43:43
* @ClassName 类名称
* @Description 类描述
*/
public class PizzaFactoryClient {
       
	public static void main(String[] args) {
		AbstractPizzaStore pizzaStore = new NyAbstractStore();
		pizzaStore.orderPizza("cheese");
	}
	
	
}
