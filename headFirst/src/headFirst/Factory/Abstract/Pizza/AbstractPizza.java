package headFirst.Factory.Abstract.Pizza;

import headFirst.Factory.Abstract.material.Cheese;
import headFirst.Factory.Abstract.material.Dough;
import headFirst.Factory.Abstract.material.Sauce;

/**
 * @author wudi
 * @version 创建时间：2018年3月18日 下午4:18:03
 * @ClassName 类名称
 * @Description 类描述
 */
public abstract class AbstractPizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 mins");
	}

	public void cut() {
		System.out.println("Cutting the pizza into dialgnal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PiaazStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
