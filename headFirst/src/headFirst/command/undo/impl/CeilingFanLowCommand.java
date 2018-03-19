package headFirst.command.undo.impl;

import headFirst.command.Command;
import headFirst.command.undo.CeilingFan;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:14:03
* @ClassName CeilingFanLowCommand
* @Description 设置低档请求
*/
public class CeilingFanLowCommand implements Command {

	private CeilingFan ceilingFan;
	private int preSpeed;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}

	@Override
	public void undo() {
		CeilingUndo.undoHandle(preSpeed, ceilingFan);
	}

}
