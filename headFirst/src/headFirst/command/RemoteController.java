package headFirst.command;

import java.util.List;

/**
* @author wudi
* @version 创建时间：2018年2月11日 下午4:36:26
* @ClassName 类名称
* @Description 类描述
*/
public class RemoteController {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand(){
		command.execute();
	}
	
	public void executeCommands(List<Command> list){
		for (Command command : list) {
			command.execute();
		}
	}
	
	
}
