package headFirst.Factory.Abstract.material.impl;

import headFirst.Factory.Abstract.material.Sauce;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:00:43
* @ClassName 类名称
* @Description 类描述
*/
public class PlumTomatoSauce implements Sauce {

	@Override
	public void getSauce() {
         System.out.println("get PlumTomatoSauce");		
	}

}
