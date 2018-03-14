package headFirst.strategy;

import headFirst.strategy.behaviors.impl.FlyWithWing;
import headFirst.strategy.behaviors.impl.Squack;
import headFirst.strategy.main.Duck;
import headFirst.strategy.main.impl.MallardDuck;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午11:14:02
* @ClassName 类名称
* @Description 类描述
*/
public class StrategyTest {
      
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.flyPerforms();
		mallardDuck.quackPerforms();
	    //动态加载行为
		System.out.println("change behavior");
		mallardDuck.setFlyBehavior(new FlyWithWing());
		mallardDuck.setQuackBehavior(new Squack());
		mallardDuck.flyPerforms();
		mallardDuck.quackPerforms();
		
	}
	
	
	
}
