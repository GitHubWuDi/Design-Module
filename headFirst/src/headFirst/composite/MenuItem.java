package headFirst.composite;

import java.util.Iterator;

/**
 * @author wudi
 * @version 创建时间：2018年2月21日 下午3:01:41
 * @ClassName MenuItem
 * @Description 菜单项(叶子节点)
 */
public class MenuItem extends MenuComponent {

	private String name;
	private String description;
	private double price;
	private boolean vegetarian;

	public MenuItem(String name, String description, double price, boolean vegetarian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void print() {
		System.out.println(" " + getName());
		if (isVegetarian()) {
			System.out.println("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println(" --" + getDescription());
	}

	public Iterator createIterator(){
		return new NullIterator();
	}
}
