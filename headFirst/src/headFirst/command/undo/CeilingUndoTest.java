package headFirst.command.undo;

import headFirst.command.Command;
import headFirst.command.undo.impl.CeilingFanHighCommand;
import headFirst.command.undo.impl.CeilingFanMiddleCommand;
import headFirst.command.undo.impl.CeilingFanOffCommand;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:29:19
* @ClassName CeilingTest
* @Description 类描述
*/
public class CeilingUndoTest {
            
	public static void main(String[] args) {
		CeilingFan ceilingFan = new CeilingFan("living room");
		Command highcommand = new CeilingFanHighCommand(ceilingFan);
		Command middlecommand = new CeilingFanMiddleCommand(ceilingFan);
		Command offcommand = new CeilingFanOffCommand(ceilingFan);
		RemoteControllerUndo remoteControllerUndo = new RemoteControllerUndo();
		remoteControllerUndo.setCommond(0, highcommand, offcommand);
		remoteControllerUndo.setCommond(1, middlecommand, offcommand);
		remoteControllerUndo.onButtonPush(0);
		remoteControllerUndo.offButtonPush(0);
		remoteControllerUndo.undoBottonPush();
	}
	
}
