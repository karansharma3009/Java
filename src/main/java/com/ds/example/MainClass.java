package com.ds.example;

 class OuterClass {

	private static String message1 = "This is static variable of outer class";
	private String message2 = "this is non static variable  of outer class ";
	
	
	public static class Istatic{
		public void printMessage()
		{
			System.out.println(message1);
			//System.out.println(message2); compilation error on accessing non static 
		}
	}
	
	public class InnerOnlyNotStatic
	{
		public void printMessage()
		{
			System.out.println(message1);
			System.out.println(message2);
		}
	}
	
	
	
	
}

public class MainClass
{
	public static void main(String[] args) {
		
		OuterClass.Istatic ic =new OuterClass.Istatic();
		ic.printMessage();
		
		OuterClass iclass = new OuterClass();
		OuterClass.InnerOnlyNotStatic inotstatic = iclass.new InnerOnlyNotStatic();
		inotstatic.printMessage();
	
	}
}

