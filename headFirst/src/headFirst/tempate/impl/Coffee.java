package headFirst.tempate.impl;

import headFirst.tempate.CaffeineBeverage;

/**
* @author wudi
* @version 创建时间：2018年3月28日 下午11:16:16
* @ClassName Coffee
* @Description 类描述
*/
public class Coffee extends CaffeineBeverage {

	@Override
	protected void brew() {
         System.out.println("Dripping Coffee through filter");		
	}
	
	@Override
	protected void addCondiments() {
		System.out.println("Adding Sugar and Milk ");			
	}

}
