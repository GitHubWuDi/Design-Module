package headFirst.Factory.Abstract.FactoryImpl;

import headFirst.Factory.Abstract.material.Cheese;
import headFirst.Factory.Abstract.material.Dough;
import headFirst.Factory.Abstract.material.Sauce;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午3:49:57
* @ClassName 类名称
* @Description 类描述
*/
public interface PizzaFactory {
    
	public Dough createDough();
    
	public Sauce ceateSauce();
	
	public Cheese createCheese();
}
