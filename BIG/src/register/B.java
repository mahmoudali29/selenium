package register;

//import login.A;

// this mean call all classes in the package
import login.*;  

public class B {
	public static void main(String[] args) {
		
		// here we must include the class in other package to use it 
		A object= new A(100,200);
		object.method1();
		object.method2();
	}
}
