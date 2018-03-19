package headFirst.command.undo.impl;

import headFirst.command.Command;
import headFirst.command.undo.CeilingFan;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:08:02
* @ClassName CeilingFanMiddleCommand
* @Description 设置中档电扇请求
*/
public class CeilingFanMiddleCommand implements Command {


	private CeilingFan ceilingFan;
	private int preSpeed;
	
	public CeilingFanMiddleCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.middle();
	}

	@Override
	public void undo() {
		CeilingUndo.undoHandle(preSpeed, ceilingFan);
	}


}
