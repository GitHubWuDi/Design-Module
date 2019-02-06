package headFirst.complex.impl.observer;
/**
* @author wudi
* @version 创建时间：2019年2月6日 下午10:35:07
* @ClassName 类名称
* @Description 类描述
*/
public class Quacklogist implements Observer {

	@Override
	public void update(QuackObserverable quackObserverable) {
		System.out.println("Quacklogist: "+quackObserverable+" just quacked");
	}

}
