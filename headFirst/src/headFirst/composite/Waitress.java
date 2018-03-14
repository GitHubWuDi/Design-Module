package headFirst.composite;

import java.util.Iterator;

/**
* @author wudi
* @version 创建时间：2018年2月21日 下午3:23:00
* @ClassName Waitress
* @Description 调用者
*/
public class Waitress {
    private MenuComponent allComponent;
    
    public Waitress(MenuComponent allComponent){
    	this.allComponent = allComponent;
    }
	
    public void printAll(){
    	allComponent.print();
    }
    
    public  void printVegetarianMenu(){
		Iterator iterator = allComponent.createIterator();
		while(iterator.hasNext()){
			MenuComponent menuComponentTest = (MenuComponent)iterator.next();
			try{
				if(menuComponentTest.isVegetarian()){
					menuComponentTest.print();
				}
			}catch(UnsupportedOperationException e){
			
			}
		}
	}
}
