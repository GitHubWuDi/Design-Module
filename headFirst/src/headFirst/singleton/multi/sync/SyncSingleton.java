package headFirst.singleton.multi.sync;
/**
* @author wudi
* @version 创建时间：2018年3月18日 下午6:30:29
* @ClassName SyncSingleton
* @Description 同步单例线程安全(同步会造成系统的负担，请谨慎使用)
*/
public class SyncSingleton {

	private static SyncSingleton uniqueSyncSingleton;
	
	private SyncSingleton(){
		
	}
	
	public static synchronized SyncSingleton getUniqueInstance(){
		if(uniqueSyncSingleton==null){
			uniqueSyncSingleton = new SyncSingleton();
		}
		return uniqueSyncSingleton;
	}
	
}
