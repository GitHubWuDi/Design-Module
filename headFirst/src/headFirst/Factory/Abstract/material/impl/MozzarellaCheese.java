package headFirst.Factory.Abstract.material.impl;

import headFirst.Factory.Abstract.material.Cheese;

/**
* @author wudi
* @version 创建时间：2018年3月18日 下午4:02:35
* @ClassName 类名称
* @Description 类描述
*/
public class MozzarellaCheese implements Cheese {

	@Override
	public void getCheese() {
           System.out.println("get MozzarellaCheese");		
	}

}
