package com.jun.test;

public class Client {
	/*	测试抽象工厂模式       */	
	public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,1);
    }
}
