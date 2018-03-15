package headFirst.observer.subject.impl;

import java.util.ArrayList;
import java.util.List;

import headFirst.observer.BusinessVO;
import headFirst.observer.observer.Observer;
import headFirst.observer.subject.MainSubject;

/**
 * @author 作者：吴迪 E-mail:wudi891012@163.com.cn
 * @version 创建时间：2018年3月15日 下午4:30:38 主题实现
 */
public class MainSubjectImpl implements MainSubject {

	private List<Observer> list = new ArrayList<>();
	
	@Override
	public void noticeObserver(BusinessVO businessVO) {
		for (Observer observer : list) {
			observer.update(businessVO);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void addObserver(Observer observer) {
		list.add(observer);
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}
	
	
	

}
