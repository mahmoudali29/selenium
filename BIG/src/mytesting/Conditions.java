package mytesting;

public class Conditions {

	public static void main(String[] args) {
		Conditions ob = new Conditions();
		ob.getData(0);
	}
	
	public void getData(int a) {
		if(a>0) {
			System.out.print("This is Positive Number .... ");
		}
		
		else if (a<0) {
			System.out.print("This is Negative Number .... ");
		}
		
		else {
			System.out.print("This is Zero Number .... ");
		}
	}
}
