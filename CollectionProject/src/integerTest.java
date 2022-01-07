
public class integerTest {
public static void main(String[] args) {
	Myinteger mi = new Myinteger(10,20);
	mi.print();
	mi.swap();
	mi.print();

	MyFloat mf = new MyFloat(10.10f,20.20f);
	mf.print();
	mf.swap();
	mf.print();
	MyString ms = new MyString("core ","java");
	ms.print();
	ms.swap();
	
}
}
class Myinteger{    //container to hold 1 integer
	private int x;//container
	private int y;
	public Myinteger(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	void swap() {//algorithm
		System.out.println("swaping...");
		int temp = x;
		x=y;
	}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
}
class MyFloat{    //container to hold 1 integer
	private Float x;//container
	private Float y;
	public MyFloat(Float x, Float y) {
		super();
		this.x = x;
		this.y = y;
	}
	void swap() {//algorithm
		System.out.println("swaping...");
		Float temp = x;
		x=y;
		y=temp;
	}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
}
class MyString{    //container to hold 1 integer
	private String x;//container
	private String y;
	public MyString(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	void swap() {//algorithm
		System.out.println("swaping...");
		String temp = x;
		x=y;
		temp=y;
	}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
}
