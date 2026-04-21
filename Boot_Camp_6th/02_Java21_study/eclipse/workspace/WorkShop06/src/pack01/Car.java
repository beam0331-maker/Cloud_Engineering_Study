package pack01;

public class Car extends Vehicle {

	private double restOil;
	private int curWeight;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	public void addOil(int oil) {
		if (oil > super.getOilTankSize()) {
			restOil = super.getOilTankSize();
		} else {
			restOil += oil;

		}

	}

	public void moving(int distance) {
		restOil -= distance * super.getEfficiency();

	}

	public void addWeight(int weight) {

		if (curWeight > super.getMaxWeight()) {
			curWeight = super.getMaxWeight();
		} else {			
			curWeight += weight;
		}
	}

	@Override
	public String toString() {
		return super.toString()+ "\t"  + "restOil= " + restOil + "\t" +"curWeight= " + curWeight;

	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}

}
