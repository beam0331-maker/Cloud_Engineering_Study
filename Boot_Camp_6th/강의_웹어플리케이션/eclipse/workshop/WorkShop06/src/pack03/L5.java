package pack03;

public class L5 extends Car implements Temp {

	public L5() {
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	// 주행
	@Override
	public void go(int distance) {
		setDistance(distance);
		setOilSize(getOilSize()-distance/8);
	}
	// Oil 충전
	@Override
	public void setOil(int oilSize) {
		int sumOfOil = getOilSize() + oilSize;
		if(sumOfOil > getOilTank()) {
			setOilSize(getOilTank());
		} else {
			setOilSize(sumOfOil);
		}
			
	}
	// 엔진온도측정
	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		return getDistance()/5;
	}
	
	
	
	
	
}
