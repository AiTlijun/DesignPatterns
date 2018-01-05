package com.jun.test;

import com.jun.factory.abstractfactory.CpuFactory;
import com.jun.factory.abstractfactory.MainboardFactory;
import com.jun.service.abstractfactory.Cpu;
import com.jun.service.abstractfactory.MainBoard;


public class ComputerEngineer {
	/**
     * ������װ����Ҫ��CPU
     */
    private Cpu cpu = null;
    /**
     * ������װ����Ҫ������
     */
    private MainBoard MainBoard = null;
    public void makeComputer(int cpuType , int MainBoard){
        /**
         * ��װ�����Ļ�������
         */
        //1:����׼����װ������Ҫ�����
        prepareHardwares(cpuType, MainBoard);
        //2:��װ����
        //3:���Ի���
        //4�������ͻ�
    }
    private void prepareHardwares(int cpuType , int MainBoard){
        //����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
        //���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�
        
        //ֱ������Ӧ�Ĺ�����ȡ
        this.cpu = CpuFactory.createCpu(cpuType);
        this.MainBoard = MainboardFactory.createMainboard(MainBoard);
        
        //��������Ƿ����
        this.cpu.calculate();
        this.MainBoard.installCPU();
    }
}
