package com.jun.service.impl.abstractfactory;

import com.jun.service.abstractfactory.MainBoard;

public class IntelMainBoard implements MainBoard {

	/**
     * CPU��۵Ŀ���
     */
    private int cpuHoles = 0;
    /**
     * ���췽��������CPU��۵Ŀ���
     * @param cpuHoles
     */
    public IntelMainBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("Intel�����CPU��ۿ����ǣ�" + cpuHoles);
    }

}
