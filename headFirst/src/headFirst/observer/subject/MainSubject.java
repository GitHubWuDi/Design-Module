package headFirst.observer.subject;

import headFirst.observer.BusinessVO;
import headFirst.observer.observer.Observer;

/**
* @author 作者：吴迪
          E-mail:wudi891012@163.com.cn
* @version 创建时间：2018年3月15日 下午4:22:57
* 类说明
*/
public interface MainSubject {
     /**
      * 通知观察者
      * @param observer
      */
	public void noticeObserver(BusinessVO businessVO);
	
	/**
	 * 删除主题观察者
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * 增加观察者
	 * @param observer
	 */
	public void addObserver(Observer observer);
}
