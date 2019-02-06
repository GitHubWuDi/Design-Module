package headFirst.complex.impl.decorate;

import headFirst.complex.Quackable;
import headFirst.complex.impl.observer.Observer;
import headFirst.complex.impl.observer.impl.Observable;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:34:26
* @ClassName 类名称
* @Description 类描述-记录鸭子叫的次数（装饰者模式）
*/
public class QuackCounter implements Quackable {
    private Quackable quackable;
	private static  Integer count = 0;
	
    
	public QuackCounter(Quackable quackable){
		this.quackable = quackable;
	}
	
	@Override
	public void quack() {
		quackable.quack();
		count++;
	}

	public static Integer getCount(){
		return count;
	}

	@Override
	public void registerObserver(Observer observer) {
		quackable.registerObserver(observer);		
	}

	@Override
	public void notifyObserver() {
		quackable.notifyObserver();
	}
}
