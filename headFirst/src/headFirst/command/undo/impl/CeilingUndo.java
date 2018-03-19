package headFirst.command.undo.impl;

import headFirst.command.undo.CeilingFan;

/**
* @author wudi
* @version 创建时间：2018年3月19日 下午11:09:03
* @ClassName 类名称
* @Description 类描述
*/
public class CeilingUndo {
       
	public static void undoHandle(int preSpeed,CeilingFan ceilingFan){
		if(preSpeed==CeilingFan.High){
      	  ceilingFan.high();
        }	else if(preSpeed==CeilingFan.Middle){
      	  ceilingFan.middle();
        }	else if(preSpeed==CeilingFan.low){
      	  ceilingFan.low();
        }	else if(preSpeed==CeilingFan.off){
      	  ceilingFan.off();
        }	
	}
}
