package headFirst.adapter;
/**
* @author wudi
* @version 创建时间：2018年3月26日 下午11:06:58
* @ClassName TurkeyAdapter
* @Description 将火鸡接口转换成鸭子的接口
*/
public class TurkeyAdapter implements Duck {
    private TurKey turKey;
	
	public TurkeyAdapter(TurKey turKey){
		this.turKey = turKey;
	}
	
	@Override
	public void quack() {
		turKey.gobble();	
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turKey.fly();
		}
	}

}
