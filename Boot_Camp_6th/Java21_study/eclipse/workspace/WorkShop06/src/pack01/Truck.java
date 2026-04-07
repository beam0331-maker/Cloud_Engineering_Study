package pack01;

public class Truck extends Car {

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}

	public double getEfficiency() {		
		return super.getEfficiency() - (super.getCurWeight()/5.0*0.2);
	}

	@Override
	public void moving(int distance) {
		super.setRestOil(super.getRestOil()-calcOil(distance));
	}

	private double calcOil(int distance) {
		return (double)distance/getEfficiency();
	}

	public int getCost(int distance) {
		
		return (int)(calcOil(distance)*3000);
	}

	@Override
	public String toString() {
		return super.toString()+ "\t" + "efficiency= " + this.getEfficiency(); 
	}

}
