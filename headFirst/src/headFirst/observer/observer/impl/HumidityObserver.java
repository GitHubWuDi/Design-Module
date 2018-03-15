package headFirst.observer.observer.impl;

import headFirst.observer.BusinessVO;
import headFirst.observer.observer.Observer;

/**
* @author 作者：吴迪
          E-mail:wudi891012@163.com.cn
* @version 创建时间：2018年3月15日 下午4:20:47
* 类说明
*/
public class HumidityObserver implements Observer {

	@Override
	public void update(BusinessVO businessVO) {
          System.out.println("Humidity is "+businessVO.getHumidity());		
	}

}
