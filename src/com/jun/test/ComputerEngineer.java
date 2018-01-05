package com.jun.test;

import com.jun.factory.abstractfactory.CpuFactory;
import com.jun.factory.abstractfactory.MainboardFactory;
import com.jun.service.abstractfactory.Cpu;
import com.jun.service.abstractfactory.MainBoard;


public class ComputerEngineer {
	/**
     * 定义组装机需要的CPU
     */
    private Cpu cpu = null;
    /**
     * 定义组装机需要的主板
     */
    private MainBoard MainBoard = null;
    public void makeComputer(int cpuType , int MainBoard){
        /**
         * 组装机器的基本步骤
         */
        //1:首先准备好装机所需要的配件
        prepareHardwares(cpuType, MainBoard);
        //2:组装机器
        //3:测试机器
        //4：交付客户
    }
    private void prepareHardwares(int cpuType , int MainBoard){
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？
        
        //直接找相应的工厂获取
        this.cpu = CpuFactory.createCpu(cpuType);
        this.MainBoard = MainboardFactory.createMainboard(MainBoard);
        
        //测试配件是否好用
        this.cpu.calculate();
        this.MainBoard.installCPU();
    }
}
