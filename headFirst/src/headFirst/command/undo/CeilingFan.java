package headFirst.command.undo;

/**
 * @author wudi
 * @version 创建时间：2018年3月19日 下午10:53:50
 * @ClassName CeilingFan
 * @Description 电扇转速的具体实现类
 */
public class CeilingFan {

	public static final int High = 3;
	public static final int Middle = 2;
	public static final int low = 1;
	public static final int off = 0;
	public int speed;
	public String location;

	public CeilingFan(String location) {
		this.location = location;
		speed = off;
	}

	public void high() {
		speed = High;
		System.out.println("CeilingFan is high");
	}

	public void middle() {
		speed = Middle;
		System.out.println("CeilingFan is middle");
	}

	public void low() {
		speed = low;
		System.out.println("CeilingFan is low");
	}

	public void off() {
		speed = off;
		System.out.println("CeilingFan is off");
	}
	public int getSpeed() {
		return speed;
	}

}
