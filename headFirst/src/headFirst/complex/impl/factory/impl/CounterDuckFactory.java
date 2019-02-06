package headFirst.complex.impl.factory.impl;

import headFirst.complex.Quackable;
import headFirst.complex.impl.MallardDuck;
import headFirst.complex.impl.adapter.DuckAdapterGoose;
import headFirst.complex.impl.adapter.Goose;
import headFirst.complex.impl.decorate.QuackCounter;
import headFirst.complex.impl.factory.AbstactDuckFactory;

/**
* @author wudi
* @version 创建时间：2019年2月6日 下午9:46:56
* @ClassName 类名称
* @Description 类描述-创建可以知道叫了多少次的鸭子工厂
*/
public class CounterDuckFactory extends AbstactDuckFactory  {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createGooseByAdapter() {
		return new QuackCounter(new DuckAdapterGoose(new Goose()));
	}

}
