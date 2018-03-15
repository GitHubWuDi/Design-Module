package headFirst.observer.observer.impl;

import headFirst.observer.BusinessVO;
import headFirst.observer.observer.Observer;

/**
* @author 作者：吴迪
          E-mail:wudi891012@163.com.cn
* @version 创建时间：2018年3月15日 下午4:16:03
* 温度观察者
*/
public class TemperatureObserver implements Observer {

	@Override
	public void update(BusinessVO businessVO) {
		double temperature = businessVO.getTemperature();
        System.out.println("Temperature is "+temperature+"°C");		
	}

}
