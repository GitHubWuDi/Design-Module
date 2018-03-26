package headFirst.adapter.impl;

import headFirst.adapter.TurKey;

/**
* @author wudi
* @version 创建时间：2018年3月26日 下午11:03:08
* @ClassName 类名称
* @Description 类描述
*/
public class WildTurKey implements TurKey {

	@Override
	public void gobble() {
             System.out.println("Gobble gobble");		
	}

	@Override
	public void fly() {
        System.out.println("I'm flying a short distance");		
	}

}
