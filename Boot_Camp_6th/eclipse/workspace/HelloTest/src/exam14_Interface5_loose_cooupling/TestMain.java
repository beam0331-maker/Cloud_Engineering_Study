package exam14_Interface5_loose_cooupling;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBService service = new DBService();
		
		// 클래스대 클래스로 접근을 하기 때문에 문제가 발생한다
		service.setDao(new MysQLDAO());
//		service.setDao(new OracleDAO());
		service.connect();
		
		
	}

}
