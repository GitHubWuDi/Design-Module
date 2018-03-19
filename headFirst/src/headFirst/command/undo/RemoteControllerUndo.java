package headFirst.command.undo;

import headFirst.command.Command;
import headFirst.command.undo.impl.NoCommand;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:18:58
* @ClassName 类名称
* @Description 类描述
*/
public class RemoteControllerUndo {
       
	
	public Command[] onCommands;
	public Command[] offCommands;
	Command undoCommand;
	
	public RemoteControllerUndo(){
		onCommands = new  Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	
	public void setCommond(int slot,Command onCommand,Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPush(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPush(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoBottonPush(){
		undoCommand.undo();
	}
	
}
