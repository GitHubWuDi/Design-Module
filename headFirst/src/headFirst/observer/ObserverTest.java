package headFirst.observer;

import headFirst.observer.observer.Observer;
import headFirst.observer.observer.impl.HumidityObserver;
import headFirst.observer.observer.impl.TemperatureObserver;
import headFirst.observer.subject.MainSubject;
import headFirst.observer.subject.impl.MainSubjectImpl;

/**
* @author 作者：吴迪
          E-mail:wudi891012@163.com.cn
* @version 创建时间：2018年3月15日 下午4:36:08
* 观察者的启动主类
*/
public class ObserverTest {
	
	public static void main(String[] args) {
		BusinessVO businessVO = new BusinessVO();
		businessVO.setTemperature(36.5);
		businessVO.setHumidity(32.3);
		Observer tObserver = new TemperatureObserver(); 
		Observer hObserver = new HumidityObserver();
		MainSubject mainSubject = new MainSubjectImpl();
		mainSubject.addObserver(tObserver);
		mainSubject.addObserver(hObserver);
		mainSubject.noticeObserver(businessVO);
	}
	
	
}
