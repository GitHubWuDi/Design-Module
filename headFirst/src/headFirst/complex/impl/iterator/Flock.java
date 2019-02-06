package headFirst.complex.impl.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import headFirst.complex.Quackable;
import headFirst.complex.impl.observer.Observer;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:58:39
* @ClassName 类名称
* @Description 类描述-采用迭代器模式对一群鸭进行管理
*/
public class Flock implements Quackable {

	private List<Quackable> quack_list = new ArrayList<>(); //quack接口集合
	
	public void add(Quackable quackable){
		quack_list.add(quackable);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quack_list.iterator();
        while(iterator.hasNext()){
        	Quackable quackable = iterator.next();
        	quackable.quack();
        }		
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quack_list.iterator();
		while(iterator.hasNext()){
			Quackable quackable = iterator.next();
			quackable.registerObserver(observer);
		}
	}

	@Override
	public void notifyObserver() {
		
	}

}
