package headFirst.strategy.behaviors.impl;

import headFirst.strategy.behaviors.QuackBehavior;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午10:56:36
* @ClassName Squack
* @Description 类描述
*/
public class Squack implements QuackBehavior {

	@Override
	public void quack() {
         System.out.println("squack");		
	}

}
