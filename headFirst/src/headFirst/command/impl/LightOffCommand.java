package headFirst.command.impl;

import headFirst.command.Command;
import headFirst.command.execute.Light;

/**
* @author wudi
* @version 创建时间：2018年2月11日 下午4:32:19
* @ClassName LightOffCommand
* @Description 关灯
*/
public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		
	}

}
