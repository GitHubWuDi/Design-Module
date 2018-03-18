package headFirst.Factory.Abstract.Pizza.impl;

import headFirst.Factory.Abstract.FactoryImpl.PizzaFactory;
import headFirst.Factory.Abstract.Pizza.AbstractPizza;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:20:53
* @ClassName NyPizza
* @Description NyPizza
*/
public class NyStylePizza extends AbstractPizza{
    
	
	private PizzaFactory pizzaFactory;
	
	public NyStylePizza(PizzaFactory pizzaFactory){
		this.pizzaFactory = pizzaFactory;
	}
	
	
	@Override
	public void prepare() {
		dough = pizzaFactory.createDough();
		sauce = pizzaFactory.ceateSauce();
		cheese = pizzaFactory.createCheese();
		dough.getDough();
		sauce.getSauce();
		cheese.getCheese();
	}
   
	
}
