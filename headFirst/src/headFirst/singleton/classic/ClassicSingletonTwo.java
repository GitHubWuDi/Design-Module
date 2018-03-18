package headFirst.singleton.classic;
/**
* @author wudi
* @version 创建时间：2018年3月18日 下午6:25:54
* @ClassName ClaasicSingletonTwo
* @Description 饿汉模式
* 用途：程序总是创建并使用单例模式，急切创建单例，在静态初始化器当中创建单件，从而保证线程安全
*/
public class ClassicSingletonTwo {

	private static ClassicSingletonTwo uniqueClassicSingleton = new ClassicSingletonTwo();
	
	private ClassicSingletonTwo(){
		
	}
	
	public static ClassicSingletonTwo getInstance(){
		return uniqueClassicSingleton;
	}
	
}
