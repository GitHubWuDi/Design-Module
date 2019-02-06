package headFirst.complex.impl.adapter;

import headFirst.complex.Quackable;
import headFirst.complex.impl.observer.Observer;
import headFirst.complex.impl.observer.impl.Observable;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:28:49
* @ClassName 类名称
* @Description 类描述-鹅适配鸭子接口(适配器模式)
*/
public class DuckAdapterGoose implements Quackable {
    private Goose goose;

    private Observable observable;
    
    
    public DuckAdapterGoose(Goose goose){
    	this.observable = new Observable(this);
    	this.goose = goose;
    }
    
	@Override
	public void quack() {
		goose.honk();
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
