package login;

public class B {
	
	public static void main(String[] args) {
		// here we can a class in the same package directly
		A object= new A(100,200);
		object.method1();
		object.method2();
	}
}
