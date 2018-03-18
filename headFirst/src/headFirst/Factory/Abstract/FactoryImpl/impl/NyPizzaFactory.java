package headFirst.Factory.Abstract.FactoryImpl.impl;

import headFirst.Factory.Abstract.FactoryImpl.PizzaFactory;
import headFirst.Factory.Abstract.material.Cheese;
import headFirst.Factory.Abstract.material.Dough;
import headFirst.Factory.Abstract.material.Sauce;
import headFirst.Factory.Abstract.material.impl.MarinaraSauce;
import headFirst.Factory.Abstract.material.impl.MozzarellaCheese;
import headFirst.Factory.Abstract.material.impl.ThickCrustDough;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:13:54
* @ClassName 类名称
* @Description 类描述
*/
public class NyPizzaFactory implements PizzaFactory {

	@Override
	public Dough createDough() {
		Dough dough = new ThickCrustDough();
		return dough;
	}

	@Override
	public Sauce ceateSauce() {
		Sauce sauce = new MarinaraSauce();
		return sauce;
	}

	@Override
	public Cheese createCheese() {
		Cheese cheese = new MozzarellaCheese();
		return cheese;
	}
  
}
