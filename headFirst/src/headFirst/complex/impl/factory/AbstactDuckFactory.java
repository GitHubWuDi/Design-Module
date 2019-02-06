package headFirst.complex.impl.factory;

import headFirst.complex.Quackable;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:43:25
* @ClassName 类名称
* @Description 类描述-抽象鸭子工厂(抽象工厂模式)
*/
public abstract class AbstactDuckFactory {

	/**
	 * 工厂创建标准鸭子
	 * @return
	 */
	public abstract Quackable createMallardDuck(); 
	
	/**
	 * 工厂创建鹅通过适配器
	 * @return
	 */
	public abstract Quackable createGooseByAdapter();
	
}
