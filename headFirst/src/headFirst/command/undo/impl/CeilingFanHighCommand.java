package headFirst.command.undo.impl;

import headFirst.command.Command;
import headFirst.command.undo.CeilingFan;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:01:05
* @ClassName CeilingFanHighCommand
* @Description 设置高档电扇命令类请求
*/
public class CeilingFanHighCommand implements Command {

	private CeilingFan ceilingFan;
	private int preSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		CeilingUndo.undoHandle(preSpeed, ceilingFan);
	}

}
