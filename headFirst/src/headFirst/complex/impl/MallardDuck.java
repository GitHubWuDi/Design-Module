package headFirst.complex.impl;


import headFirst.complex.Quackable;
import headFirst.complex.impl.observer.Observer;
import headFirst.complex.impl.observer.impl.Observable;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:14:13
* @ClassName 类名称
* @Description 类描述-标准鸭子叫
*/
public class MallardDuck implements Quackable {
   private Observable observable;
   
   public MallardDuck(){
	   this.observable = new Observable(this);
   }
	
	@Override
	public void quack() {
		/**
		 * 鸭子叫
		 */
		System.out.println("quack");
		
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		observable.notifyObserver();		
	}

}
