import com.java.container.MyFloat;
import com.java.container.MyInteger;
import com.java.container.MyJukeBox;
import com.java.container.MyString;
import com.java.container.Song;

public class Tester {
	public static void main(String[] args) {
		
		MyInteger mi = new MyInteger(10,20);
		mi.print();		
		mi.swap();   
		mi.print();
		
		System.out.println("--------");
		
		MyFloat mf = new MyFloat(10.4f, 56.9f);
		mf.print();
		mf.swap();
		mf.print();
		
		System.out.println("--------");
		
		MyString ms = new MyString("Core","Java");
		ms.print();
		ms.swap();
		ms.print();
		
		System.out.println("--------");
		
		Song s1 = new Song("I want it that way","Millenium","Backstreet Boys",1999);
		Song s2 = new Song("My Heart Will Go On","Titanic","Celine D",1995);
		
		
		MyJukeBox jukeBox = new MyJukeBox(s1,s2);
		jukeBox.print();
		jukeBox.swap();
		jukeBox.print();
		
	}
}

