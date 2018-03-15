package headFirst.observer.observer;

import headFirst.observer.BusinessVO;

/**
* @author 作者：吴迪
          E-mail:wudi891012@163.com.cn
* @version 创建时间：2018年3月15日 下午4:10:49
* 观察者接口
*/
public interface Observer {
       
	public void update(BusinessVO businessVO);
}
