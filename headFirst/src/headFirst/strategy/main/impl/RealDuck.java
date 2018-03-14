package headFirst.strategy.main.impl;

import headFirst.strategy.behaviors.impl.FlyWithWing;
import headFirst.strategy.behaviors.impl.Quack;
import headFirst.strategy.main.Duck;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午11:11:34
* @ClassName RealDuck
* @Description 真鸭子
*/
public class RealDuck extends Duck {

	 public RealDuck() {
         flyBehavior = new FlyWithWing();
         quackBehavior = new Quack();
	}
	
	
	@Override
	public void display() {
		System.out.println("I'm real Duck");
		
	}

}
