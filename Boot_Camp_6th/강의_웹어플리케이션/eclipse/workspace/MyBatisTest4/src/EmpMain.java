import java.util.List;

import org.apache.ibatis.session.SqlSession;

import p1.EmpDTO;
import p1.MySqlSessionFactory;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		SqlSession session = MySqlSessionFactory.getSession();
		
		List<EmpDTO> list = session.selectList("com.config.EmpMapper.findaAll");
		for(EmpDTO e : list) {
			System.out.println(e);
		}
		System.out.println("--------------------------------");
		List<EmpDTO> list2 = session.selectList("com.config.EmpMapper.findByRseultMap");
		for(EmpDTO e : list2) {
			System.out.println(e);
		}		
		
		session.close();		
	}

}
