package headFirst.composite;

import java.util.Iterator;

/**
* @author wudi
* @version 创建时间：2018年2月21日 下午4:06:16
* @ClassName 类名称
* @Description 类描述
*/
public class NullIterator implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

}
