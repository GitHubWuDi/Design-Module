package headFirst.composite;

import java.util.Iterator;

/**
* @author wudi
* @version 创建时间：2018年2月21日 下午3:25:05
* @ClassName TestCompsite
* @Description 测试类
*/
public class TestCompsite {

	public static void main(String[] args) {
		MenuComponent allMenu = new Menu("ALL MUNUS","All menus combined");
		MenuComponent pancketHouseMenu = new Menu("PANCAKE HOUSE MENU","breakfast");
		MenuComponent dinnerMenu = new Menu("DINER MENU","lunch");
		MenuComponent cafeMenu = new Menu("Cafe Menu","dinner");
		MenuComponent dessertMenu = new Menu("dessertMenu", "dessert");
		allMenu.add(pancketHouseMenu);
		allMenu.add(dinnerMenu);
		allMenu.add(cafeMenu);
		
		
		dinnerMenu.add(new MenuItem("test", "test123", 0.5, true));
		dinnerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("12345", "1234567890", 0.7, false));
		
		Waitress waitress = new Waitress(allMenu);
//		waitress.printAll();
		waitress.printVegetarianMenu();
	}
	
	
	
	
}
