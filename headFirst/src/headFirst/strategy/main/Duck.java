package headFirst.strategy.main;

import headFirst.strategy.behaviors.FlyBehavior;
import headFirst.strategy.behaviors.QuackBehavior;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午10:58:56
* @ClassName 类名称
* @Description 类描述
*/
public abstract class Duck {
      
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	//不用关心具体飞行的行为
	public void flyPerforms(){
		flyBehavior.fly();
	}
	//不关心具体叫的动作
	public void quackPerforms(){
		quackBehavior.quack();
	}
	
	//这是共有的东西
	public void swim(){
		System.out.println("all duck swim");
	}
    //动态加载行为
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
}
