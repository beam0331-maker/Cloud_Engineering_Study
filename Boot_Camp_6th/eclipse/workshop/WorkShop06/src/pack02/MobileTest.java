package pack02;

public class MobileTest {

	public static void main(String[] args) {

		Ltab l = new Ltab("Ltab", 500,"AP-01");
		Otab o = new Otab("Otab", 1000,"AND-20");
		
		System.out.println("mobileName: " + l.getMobileName() + "\tbatterySize: "+ l.getBatterySize() + "\tosType: "+ l.getOsType());
		System.out.println("mobileName: " + o.getMobileName() + "\tbatterySize: "+ o.getBatterySize() + "\tosType: "+ o.getOsType());
		System.out.println("-----------------------------------------");
		l.charge(10);
		o.charge(10);
		System.out.println("mobileName: " + l.getMobileName() + "\tbatterySize: "+ l.getBatterySize() + "\tosType: "+ l.getOsType());
		System.out.println("mobileName: " + o.getMobileName() + "\tbatterySize: "+ o.getBatterySize() + "\tosType: "+ o.getOsType());
		System.out.println("-----------------------------------------");
		l.operate(5);
		o.operate(5);
		System.out.println("mobileName: " + l.getMobileName() + "\tbatterySize: "+ l.getBatterySize() + "\tosType: "+ l.getOsType());
		System.out.println("mobileName: " + o.getMobileName() + "\tbatterySize: "+ o.getBatterySize() + "\tosType: "+ o.getOsType());
		
		
		
		
		
	}

}
