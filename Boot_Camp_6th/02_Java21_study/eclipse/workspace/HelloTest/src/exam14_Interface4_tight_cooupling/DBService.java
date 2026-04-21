package exam14_Interface4_tight_cooupling;

public class DBService {

//	dao 수정시 모든 관련 요소를 변경해야 한다.
//	MysQLDAO dao;
	OracleDAO dao;

// 	set메서드로 초기화
//	public void setDao(MysQLDAO dao) {
//		this.dao = dao;
//	}

	public void setDao(OracleDAO dao) {
		this.dao = dao;
	}

	public void connect() {
//		dao.connectMySQL();
		dao.connectOracle();
	}

}
