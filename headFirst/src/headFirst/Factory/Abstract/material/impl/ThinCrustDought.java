package headFirst.Factory.Abstract.material.impl;

import headFirst.Factory.Abstract.material.Dough;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午3:59:34
* @ClassName 类名称
* @Description 类描述
*/
public class ThinCrustDought implements Dough {

	@Override
	public void getDough() {
         System.out.println("get ThinCrustDought");		
	}

}
