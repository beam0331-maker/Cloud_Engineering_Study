package exam14_Interface5_loose_cooupling;

public class DBService {

//  클래스로 연결되어 있다
//	dao 수정시 모든 관련 요소를 변경해야 한다.
//	MysQLDAO dao;
//	OracleDAO dao;
	
// 클래스가 아니라 인터페이스로 연결한다
	DBDAO dao;
	

// 	set메서드로 초기화
//	public void setDao(MysQLDAO dao) {
//		this.dao = dao;
//	}
	
	public void setDao(DBDAO dao) {
		this.dao = dao;
	}

	public void connect() {
		dao.connectDB();
	}

}
