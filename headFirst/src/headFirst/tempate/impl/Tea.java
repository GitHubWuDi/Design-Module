package headFirst.tempate.impl;

import headFirst.tempate.CaffeineBeverage;

/**
* @author wudi
* @version 创建时间：2018年3月28日 下午11:12:11
* @ClassName Tea
* @Description 类描述
*/
public class Tea extends CaffeineBeverage {

	@Override
	protected void brew() {
 	     System.out.println("Steeping the tea");	
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
