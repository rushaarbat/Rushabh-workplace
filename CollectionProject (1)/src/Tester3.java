
public class Tester3 {
	public static void main(String[] args) {
		
		System.out.println(10+20+ " sum " +(10+20) );
		Person p  = new Person();
		System.out.println("p "+p);
		System.out.println("p "+p.getPerson());
		
	}
}
class Person
{
	private int age=22;
	private String name ="Jack";
	private float salary=20202;
	
	
	public String getPerson() {
		return "Person [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
