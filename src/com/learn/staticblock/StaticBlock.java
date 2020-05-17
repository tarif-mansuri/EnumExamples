//$Id$
package com.learn.staticblock;

public class StaticBlock {
	public static void main(String[] args){
		System.out.println(StaticDefinition.x);
	}

}
class StaticDefinition{
	static{
		System.out.println("Static block ran");
	}
	public static int x = 10;
	public static void method(){
		//StaticDefinition sd = new StaticDefinition();
		System.out.println(15);
	}
	public int getX(){
		return x;
	}
}
