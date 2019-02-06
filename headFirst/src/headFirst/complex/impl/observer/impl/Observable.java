package headFirst.complex.impl.observer.impl;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import headFirst.complex.impl.observer.Observer;
import headFirst.complex.impl.observer.QuackObserverable;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午10:16:08
* @ClassName 类名称
* @Description 类描述-订阅者具体实现类
*/
public class Observable implements QuackObserverable {

	private List<Observer> list = new ArrayList<>();
	private QuackObserverable duck;
	
	public Observable(QuackObserverable duck){
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void notifyObserver() {
		Iterator<Observer> iterator = list.iterator();
		while(iterator.hasNext()){
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
