package headFirst.strategy.behaviors.impl;

import headFirst.strategy.behaviors.QuackBehavior;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午10:54:57
* @ClassName Quack
* @Description 呱呱叫
*/
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
         System.out.println(" duck is quacking ");		
	}

}
