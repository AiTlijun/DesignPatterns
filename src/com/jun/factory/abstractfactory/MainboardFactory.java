package com.jun.factory.abstractfactory;

import com.jun.service.abstractfactory.MainBoard;
import com.jun.service.impl.abstractfactory.AmdMainBoard;
import com.jun.service.impl.abstractfactory.IntelMainBoard;

public class MainboardFactory {
	
	public static MainBoard createMainboard(int type){
		MainBoard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainBoard(755);
        }else if(type == 2){
            mainboard = new AmdMainBoard(938);
        }
        return mainboard;
    }
}
