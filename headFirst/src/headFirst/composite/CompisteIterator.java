package headFirst.composite;

import java.util.Iterator;
import java.util.Stack;

/**
* @author wudi
* @version 创建时间：2018年2月21日 下午3:52:53
* @ClassName CompisteIterator
* @Description 组合迭代器
*/
public class CompisteIterator implements Iterator {

	Stack stack = new Stack();
	
	public CompisteIterator(Iterator iterator){
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
        if(stack.isEmpty()){
        	return false;
        }else{
        	Iterator iterator = (Iterator)stack.peek();
        	if(!iterator.hasNext()){
        		stack.pop();
        		return hasNext();
        	}else{
        		return true;
        	}
        }
	}

	@Override
	public Object next() {
        if(hasNext()){
        	Iterator iterator = (Iterator)stack.peek();
        	MenuComponent menuComponent = (MenuComponent)iterator.next();
        	if(menuComponent instanceof Menu){
        		stack.push(menuComponent.createIterator());
        	}
        	return menuComponent;
        }
		return null;
	}

}
