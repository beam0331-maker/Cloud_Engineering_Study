package pack03;

public class L3 extends Car implements Temp {

	public L3() { 
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	// 주행
	@Override
	public void go(int distance) {
		setDistance(distance);
		setOilSize(getOilSize()-distance/10);
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
		return super.getDistance()/10;
	}
	
	
	
	
	
}
