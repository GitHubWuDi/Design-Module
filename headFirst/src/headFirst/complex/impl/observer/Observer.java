package headFirst.complex.impl.observer;


/**
* @author wudi
* @version 创建时间：2019年2月6日 下午10:13:24
* @ClassName 类名称
* @Description 类描述 -鸭子叫的观察者接口
*/
public interface Observer {

	/**
	 * 更新观察者信息
	 * @param observer
	 */
	public void update(QuackObserverable quackObserverable);
	
}
