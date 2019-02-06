package headFirst.complex;

import headFirst.complex.impl.observer.QuackObserverable;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:12:35
* @ClassName 类名称
* @Description 类描述 行为接口-鸭子-叫
*/
public interface Quackable extends QuackObserverable  {
   
	/**
	 * 鸭子叫的行为接口
	 */
	public void quack();
}
