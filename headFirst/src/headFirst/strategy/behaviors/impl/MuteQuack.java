package headFirst.strategy.behaviors.impl;

import headFirst.strategy.behaviors.QuackBehavior;

/**
* @author wudi
* @version 创建时间：2018年3月14日 下午10:57:45
* @ClassName 类名称
* @Description 类描述
*/
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
      System.out.println("duck is MuteQuack");		
	}

}
