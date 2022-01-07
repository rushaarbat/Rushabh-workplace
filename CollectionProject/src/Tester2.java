import com.java.container.MyFloat;
import com.java.container.MyInteger;
import com.java.container.MyJukeBox;
import com.java.container.MyString;
import com.java.container.MyValue;
import com.java.container.Song;

//MyValue is a raw type. 
//References to generic type
//MyValue<AnyType> should be parameterized
public class Tester2 {
	public static void main(String[] args) {
		
		
		MyValue<Integer> mi = new MyValue<Integer>(10,20);
		mi.print();	
		mi.swap();   
		mi.print();
		
		System.out.println("--------");
		
		MyValue<Float> mf = new MyValue<Float>(10.4f, 56.9f);
		mf.print();
		mf.swap();
		mf.print();
		
		System.out.println("--------");
		
		MyValue<String> ms = new MyValue<String>("Core","Java");
		ms.print();
		ms.swap();
		ms.print();
		
		System.out.println("--------");
		
		Song s1 = new Song("I want it that way","Millenium","Backstreet Boys",1999);
		Song s2 = new Song("My Heart Will Go On","Titanic","Celine D",1995);
		
		
		MyValue<Song> jukeBox = new MyValue<Song>(s1,s2);
		jukeBox.print();
		jukeBox.swap();
		jukeBox.print();
		
	}
}

