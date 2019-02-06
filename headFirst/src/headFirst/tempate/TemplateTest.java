package headFirst.tempate;

import headFirst.tempate.impl.Coffee;
import headFirst.tempate.impl.Tea;

/**
* @author wudi
* @version 创建时间：2018年3月28日 下午11:18:32
* @ClassName TemplateTest
* @Description 类描述
*/
public class TemplateTest {
      
	   public static void main(String[] args) {
		   Tea tea = new Tea();
		   tea.prepareRecipe();
           System.out.println("\n");		   
		   Coffee coffee = new Coffee();
		   coffee.prepareRecipe();
		   ClassLoader classLoader = TemplateTest.class.getClassLoader();
		   try {
			   TemplateTest templateTest = (TemplateTest)Class.forName("headFirst.tempate.TemplateTest").newInstance();
			   templateTest.printInfo();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("TemplateTest ClassLoader is "+classLoader);
	}
	   
	   
	   public void printInfo(){
		   System.out.println("test is best");
	   }
	   
}
