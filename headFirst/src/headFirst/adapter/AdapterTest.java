package headFirst.adapter;

import headFirst.adapter.impl.MallardDuck;
import headFirst.adapter.impl.WildTurKey;

/**
* @author wudi
* @version 创建时间：2018年3月26日 下午11:10:11
* @ClassName AdapterTest
* @Description 类描述
*/
public class AdapterTest {
     
	        public static void main(String[] args) {
				
	        	Duck duck = new MallardDuck(); //创建一只鸭子
	        	TurKey turKey = new WildTurKey(); //创建一只火鸡
	        	Duck turKeyAdapter = new TurkeyAdapter(turKey); //创建火鸡到鸭子的适配器
	        	testDuck(turKeyAdapter); //一只火鸡伪装成一只鸭子

	        }
	        
	        static void testDuck(Duck duck){
	        	duck.quack();
	        	duck.fly();
	        }
}
