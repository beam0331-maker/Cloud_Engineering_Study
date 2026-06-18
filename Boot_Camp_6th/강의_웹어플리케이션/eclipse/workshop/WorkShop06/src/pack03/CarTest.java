package pack03;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car[] arr = new Car[2];
		arr[0] = new L3("L3","1500",50,25,0);
		arr[1] = new L5("L5","2500",70,35,0);
		for(Car c:arr)
			if(c instanceof L3)
				System.out.println("vehicleName: " + c.getName() + "\tengineSize: " + c.getEngine() + "\toilTank: " + c.getOilTank() +"\toilSize: " + c.getOilSize() + "\tdistance: " + c.getDistance() + "\ttemperature: " + ((L3)c).getTempGage());
			else
				System.out.println("vehicleName: " + c.getName() + "\tengineSize: " + c.getEngine() + "\toilTank: " + c.getOilTank() +"\toilSize: " + c.getOilSize() + "\tdistance: " + c.getDistance() + "\ttemperature: " + ((L5)c).getTempGage());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for(Car c:arr)
			c.setOil(25);
		for(Car c:arr)
			if(c instanceof L3)
				System.out.println("vehicleName: " + c.getName() + "\tengineSize: " + c.getEngine() + "\toilTank: " + c.getOilTank() +"\toilSize: " + c.getOilSize() + "\tdistance: " + c.getDistance() + "\ttemperature: " + ((L3)c).getTempGage());
			else
				System.out.println("vehicleName: " + c.getName() + "\tengineSize: " + c.getEngine() + "\toilTank: " + c.getOilTank() +"\toilSize: " + c.getOilSize() + "\tdistance: " + c.getDistance() + "\ttemperature: " + ((L5)c).getTempGage());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for(Car c:arr)
			c.go(80);
		for(Car c:arr)
			if(c instanceof L3)
				System.out.println("vehicleName: " + c.getName() + "\tengineSize: " + c.getEngine() + "\toilTank: " + c.getOilTank() +"\toilSize: " + c.getOilSize() + "\tdistance: " + c.getDistance() + "\ttemperature: " + ((L3)c).getTempGage());
			else
				System.out.println("vehicleName: " + c.getName() + "\tengineSize: " + c.getEngine() + "\toilTank: " + c.getOilTank() +"\toilSize: " + c.getOilSize() + "\tdistance: " + c.getDistance() + "\ttemperature: " + ((L5)c).getTempGage());
		

		
		

	}

}
