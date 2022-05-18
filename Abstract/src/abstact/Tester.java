package abstact;

public class Tester {
	double z=12345;

	public static void main(String[] args) {
	C obj=new C();
	obj.show();
    obj.display1();
   //obj.display();
	}	

}
abstract class A{
	
	  void display() { 
		  System.out.println("display"); 
		  }
	 
	abstract void show();
}
abstract class B  {
	abstract void show();
	abstract void display1();
}
class C extends B{
	void display1() {
		System.out.println("display1");
	}
	void show() {
		System.out.println("show");
	}
}