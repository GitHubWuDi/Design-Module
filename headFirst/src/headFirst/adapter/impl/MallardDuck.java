package headFirst.adapter.impl;

import headFirst.adapter.Duck;

/**
* @author wudi
* @version 创建时间：2018年3月26日 下午11:00:01
* @ClassName MallardDuck
* @Description 绿头鸭
*/
public class MallardDuck implements Duck {

	@Override
	public void quack() {
          System.out.println("Quack");		
	}

	@Override
	public void fly() {
         System.out.println("I'm flying");		
	}

}
