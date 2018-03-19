package headFirst.command.undo.impl;

import headFirst.command.Command;
import headFirst.command.undo.CeilingFan;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:32:22
* @ClassName CeilingFanOffCommand
* @Description 关闭风扇请求
*/
public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	private int preSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		CeilingUndo.undoHandle(preSpeed, ceilingFan);
	}



}
