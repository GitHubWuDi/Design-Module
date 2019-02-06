package headFirst.complex;

import headFirst.complex.impl.MallardDuck;
import headFirst.complex.impl.adapter.DuckAdapterGoose;
import headFirst.complex.impl.adapter.Goose;
import headFirst.complex.impl.decorate.QuackCounter;
import headFirst.complex.impl.factory.AbstactDuckFactory;
import headFirst.complex.impl.factory.impl.CounterDuckFactory;
import headFirst.complex.impl.iterator.Flock;
import headFirst.complex.impl.observer.Quacklogist;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:20:49
* @ClassName 类名称
* @Description 类描述-鸭子模拟器类
*/
public class DuckSimulate {
     
	/**
	 * 模拟集合实现接口
	 */
	public void simulate(){
//		Quackable mallardDuck = new QuackCounter(new MallardDuck());  //次数装饰者模式对duck进行对应的包装
//		Quackable duckAdaperGoose = new QuackCounter(new DuckAdapterGoose(new Goose()));
//		simulate(mallardDuck);
//		simulate(duckAdaperGoose); //鹅被适配成鸭子的模拟器
		//工厂模式模拟器
		AbstactDuckFactory abstactDuckFactory = new CounterDuckFactory();
		simulate(abstactDuckFactory);
	}
	
	
	/**
	 * //模拟实现接口
	 * @param quackable
	 */
	public void simulate(Quackable quackable){
		quackable.quack();
	}
	
	/**
	 * 工厂模式模拟器
	 * @param abstactDuckFactory
	 */
	public void simulate(AbstactDuckFactory abstactDuckFactory){
		Flock flock = new Flock();
		
		Quackable createGooseByAdapter = abstactDuckFactory.createGooseByAdapter();
		Quackable createMallardDuck = abstactDuckFactory.createMallardDuck();
		flock.add(createGooseByAdapter);
		flock.add(createMallardDuck);
//		simulate(flock);
		Quacklogist quacklogist = new Quacklogist();
		flock.registerObserver(quacklogist);
		simulate(flock);
		System.out.println("The Duck quacked "+QuackCounter.getCount()+" times");
//		simulate(createGooseByAdapter);
//		simulate(createMallardDuck);
	}
	
	
	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
		DuckSimulate duckSimulate =  new DuckSimulate();
		duckSimulate.simulate();
		
	}
}
