package headFirst.tempate;
/**
* @author wudi
* @version 创建时间：2018年3月28日 下午11:07:01
* @ClassName CaffeineBeverage
* @Description 类描述
*/
public abstract class CaffeineBeverage {
   
   public final void prepareRecipe(){
	     boilWater();
	     brew();
	     pourInCup();
	     addCondiments();
	     
	}
	
   protected abstract void brew();
	
	protected abstract void addCondiments();
	
	 void boilWater(){
		System.out.println("Boiling water");
	}
	
	 void pourInCup(){
		System.out.println("Pouring into cup");
	}
}
