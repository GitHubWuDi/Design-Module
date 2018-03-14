package headFirst.strategy.behaviors.impl;

import headFirst.strategy.behaviors.FlyBehavior;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午10:49:54
* @ClassName FlyWithWing
* @Description 可以飞行
*/
public class FlyWithWing implements FlyBehavior {

	@Override
	public void fly() {
         System.out.println("Fly With Wing");		
	}

}
