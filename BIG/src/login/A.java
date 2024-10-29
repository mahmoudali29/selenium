package login;

public class A {
	
	
	public A(int a,int b) {
		// TODO Auto-generated constructor stub
		// take the same name 
		// call auto
		// no return 
		System.out.print("Print constructor");
	}
	
	
	public static void main(String[] args) {
//		System.out.print("Testing");
		
		A object= new A(100,200);
		
		
		object.sum(100,200);
//		object.method1();
//		object.method2();
	}
	
	public void method1() {
		System.out.print("method1");
	}
	
	public void method2() {
		System.out.print("method2");
	}
	
	public void sum(int a,int b) {
//		int a = 100;
//		int b = 200;
		int c = a+b;
		System.out.print(c);
	
				
	}
	
	
	
	
}
