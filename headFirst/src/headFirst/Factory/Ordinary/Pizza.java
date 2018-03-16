package headFirst.Factory.Ordinary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wudi
 * @version 创建时间：2018年3月16日 下午11:05:30
 * @ClassName Pizza
 * @Description 披萨
 */
public abstract class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;

	public List<String> list = new ArrayList<>();

	void prepare() {
		System.out.println("Preparing:" + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		for (String topping : list) {
			System.out.println(" " + topping);
		}
	}

	void bake() {
       System.out.println("Bake for 25 mins");
	}
	
	
	void cut(){
		System.out.println("Cutting the pizza into dialgnal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official PiaazStore box");
	}
	
	public String getName(){
		return name;
	}
}
