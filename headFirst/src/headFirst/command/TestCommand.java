package headFirst.command;

import java.util.ArrayList;
import java.util.List;

import headFirst.command.execute.Light;
import headFirst.command.impl.LightOffCommand;
import headFirst.command.impl.LightOnCommand;

/**
* @author wudi
* @version 创建时间：2018年2月11日 下午5:08:03
* @ClassName 类名称
* @Description 类描述
*/
public class TestCommand {

	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
//		remoteController.setCommand(lightOnCommand);
//		remoteController.executeCommand();
//		remoteController.setCommand(lightOffCommand);
//		remoteController.executeCommand();
		List<Command> list = new ArrayList<>();
		list.add(lightOffCommand);
		list.add(lightOnCommand);
		remoteController.executeCommands(list);
	}
	
	
	
}
