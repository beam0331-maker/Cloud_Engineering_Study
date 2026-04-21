package exam2.select;

import java.util.List;

// 화면처리 담당
// DepService와 연동
public class DeptSelectMain {

	public static void main(String[] args) {
		// DepService와 연동
		DeptService service = new DeptServiceImpl();
		service.setDao(new DeptDAO());
		List<DeptDTO> list = service.list();
		
		for(DeptDTO dto : list) {
			System.out.println(dto); // dto.toString()
		}
	}

}
