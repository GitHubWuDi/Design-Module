package headFirst.command.impl;

import headFirst.command.Command;
import headFirst.command.execute.Light;

/**
* @author wudi
* @version 创建时间：2018年2月11日 下午4:23:56
* @ClassName LightOnCommand
* @Description 灯开启命令
*/
public class LightOnCommand implements Command  {
    private Light light;
	
    public LightOnCommand(Light light){
    	this.light = light;
    }
    
	@Override
	public void execute() {
		light.on();  		
	}

	@Override
	public void undo() {
		
	}
     
	
	
}
