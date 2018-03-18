package headFirst.singleton.classic;
/**
* @author wudi
* @version 创建时间：2018年3月18日 下午5:51:12
* @ClassName ClassicSingon
* @Description 经典单例
* 特点：延迟实例化（懒汉模式）如果在多线程的情况下，可能会出现问题
*/
public class ClassicSingleton {
       private static ClassicSingleton uniqueClassicSingleton;
       
       private ClassicSingleton(){
    	   
       }
       
       public static ClassicSingleton getUniqueClassicSingleton(){
    	   if(uniqueClassicSingleton==null){
    		   uniqueClassicSingleton = new ClassicSingleton();
    	   }
    	   return uniqueClassicSingleton;
       }
       
}
