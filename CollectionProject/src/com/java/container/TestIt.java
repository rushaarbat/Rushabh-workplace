package com.java.container;
public class TestIt {
	public static void main(String[] args) {
		Myinteger mi = new Myinteger(10,20);
		mi.print();
		mi.swap();
		MyFloat mf = new MyFloat(10.10f,20.20f);
		mf.print();
		mf.swap();
		MyString ms = new MyString("core ","java");
		ms.print();
		ms.swap();

	}

}
