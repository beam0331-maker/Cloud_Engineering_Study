package exam14_Interface5_loose_cooupling;

public class OracleDAO implements DBDAO {
	
	// Oracle DB 연동
	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectOracle()");
	}

}
