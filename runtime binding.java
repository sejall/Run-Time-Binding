import java.util.Scanner;
class A
{
	int x=1;
	static int y=2;
	void m1()
	{
		System.out.println("super1");
	}
	 static void m2()
	{
		System.out.println("super2"); 
	}
}
class B extends A
{
		int x=9;
	static int y=8;
	void m1()
	{
		System.out.println("sub1");
	}
	static void m2()
	{
		System.out.println("sub2"); 
	}
	
}
class ABTest
{
	public static void main(String args[])
	{
		A a1=new A();
		System.out.println(a1.x+","+a1.y);
		a1.m1();
		a1.m2();
		
		B b1=new B();
		System.out.println(b1.x+","+b1.y);
		b1.m1();
		b1.m2();
		A a2=new B();
		System.out.println(a2.x+","+a2.y);
		a2.m1();
		a2.m2();
		
		
	}	
}
