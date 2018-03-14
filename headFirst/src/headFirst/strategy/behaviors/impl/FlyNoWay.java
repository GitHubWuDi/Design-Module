package headFirst.strategy.behaviors.impl;

import headFirst.strategy.behaviors.FlyBehavior;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午10:51:32
* @ClassName FlyNoWay
* @Description 不会飞行
*/
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
           System.out.println("Fly no wing");		
	}

}
