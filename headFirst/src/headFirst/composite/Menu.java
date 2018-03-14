package headFirst.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
* @author wudi
* @version 创建时间：2018年2月21日 下午3:07:39
* @ClassName Menu
* @Description 菜单项
*/
public class Menu extends MenuComponent {

	private ArrayList menuComponents = new ArrayList();
	private String name;
	private String description;
	
	public Menu(String name,String description){
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return (MenuComponent)menuComponents.get(i);
		
	}
	
	public void print() {
		System.out.println("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("------------------");
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
			
		}
	}
	
	public Iterator createIterator(){
		return new CompisteIterator(menuComponents.iterator());
	}
	
}
