package headFirst.strategy.main.impl;

import headFirst.strategy.behaviors.impl.FlyNoWay;
import headFirst.strategy.behaviors.impl.MuteQuack;
import headFirst.strategy.main.Duck;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午11:06:42
* @ClassName MallardDuck
* @Description 具体的鸭子
*/
public class MallardDuck extends Duck {

	public MallardDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	
	@Override
	public void display() {
       System.out.println("I'm MallardDuck");
	}

}
