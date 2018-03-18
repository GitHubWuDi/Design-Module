package headFirst.singleton.multi.twomulti;
/**
* @author wudi
* @version 创建时间：2018年3月18日 下午6:39:21
* @ClassName TwoSyncLockSingleton
* @Description 双重检查加锁：首选检查对象是否已经实例化，如果尚未创建，才进行同步，只需进行一次同步，达到单例的效果
*/
public class TwoSyncLockSingleton {
    //unqiueTwoSyncLockSingleton变量被初始化成Singleton实例时，确保多线程正确处理unqiueTwoSyncLockSingleton
	private static volatile TwoSyncLockSingleton unqiueTwoSyncLockSingleton;
	
	private TwoSyncLockSingleton(){}
	
	public static TwoSyncLockSingleton getInstance(){
		//如果不存在就进行同步区块
		if(unqiueTwoSyncLockSingleton==null){
			//只有第一次实例化的情况下才会执行到这里
			synchronized (TwoSyncLockSingleton.class) {
				//确认unqiueTwoSyncLockSingleton为null进行第一次实例化
				if(unqiueTwoSyncLockSingleton==null){
					unqiueTwoSyncLockSingleton = new TwoSyncLockSingleton();
				}
			}
		}
		return unqiueTwoSyncLockSingleton;
	}
	
	
}
