
public class Transformer {
	public static void main(String[] args) {
System.out.println("TRANSFORMER WORKING....");

Oil o1=new Oil();
o1.setOilName("SILICON");
o1.setOilIntencity(8);
o1.setOilType("thick");
o1.setOilPrice(100);

System.out.println("BEFOR OILING IT MAKING NOISE......." +o1);
AcTransformer acTrans=new AcTransformer();
acTrans.insertion();
System.out.println("**************************************************");

System.out.println("AFTER OILING THE NOISE GET REDUCE......");


	}

}
class Oil{
	private String OilName;
	private int OilIntencity;
	private String OilType;
	private float OilPrice;
	private String OilWork;

	
	public String getOilWork() {
		return OilWork;
	}
	public void setOilWork(String oilWork) {
		OilWork = oilWork;
	}
	public String getOilName() {
		return OilName;
	}
	public void setOilName(String oilName) {
		OilName = oilName;
	}
	public int getOilIntencity() {
		return OilIntencity;
	}
	public void setOilIntencity(int oilIntencity) {
		OilIntencity = oilIntencity;
	}
	public String getOilType() {
		return OilType;
	}
	public void setOilType(String oilType) {
		OilType = oilType;
	}
	public float getOilPrice() {
		return OilPrice;
	}
	public void setOilPrice(float oilPrice) {
		OilPrice = oilPrice;
	}
	@Override
	public String toString() {
		return "Oil [OilName=" + OilName + ", OilIntencity=" + OilIntencity + ", OilType=" + OilType + ", OilPrice="
				+ OilPrice + ", OilWork=" + OilWork + "]";
	}
	
}

class BestTransformer{
	
}
class AcTransformer extends BestTransformer{
	private IronCoil ic=new IronCoil();
	void insertion() {
		System.out.println("ONLY OIL INSERTION PROCESS");
		ic.noise();
		ic.magnetic();
	}
	
}
class Coil{
	
}
class IronCoil extends Coil{
	void magnetic() {
		System.out.println("magnetising effect produce...");
		
	}
	void noise() {
		System.out.println("SOMETIMES MAKE NOISE..."); 
	}
	
}