package pack02;

public class Ltab extends Mobile{
	
	public Ltab() {
		// TODO Auto-generated constructor stub
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		super.setBatterySize(super.getBatterySize()-time*10);
		return super.getBatterySize();
	}

	@Override
	public int charge(int time) {
		super.setBatterySize(super.getBatterySize()+time*10);
		return super.getBatterySize();
	}
	

}
