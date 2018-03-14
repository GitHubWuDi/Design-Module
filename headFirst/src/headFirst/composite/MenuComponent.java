package headFirst.composite;

import java.util.Iterator;

/**
* @author wudi
* @version 创建时间：2018年2月21日 下午2:54:42
* @ClassName MenuComponent
* @Description 菜单组件接口
*/
public abstract class MenuComponent {
	
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
	
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	public Iterator createIterator(){
		throw new UnsupportedOperationException();
	}
}
