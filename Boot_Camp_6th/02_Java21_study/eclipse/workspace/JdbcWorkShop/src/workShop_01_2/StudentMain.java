package workShop_01_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class StudentMain {

	public static void main(String[] args) {

		while (true) {

			System.out.println("""
					***********************************************
					           [학생 정보 관리 메뉴]
					***********************************************
					0. 종료
					1. 전체 학생 목록
					***********************************************
					""");
			System.out.print("메뉴입력 => ");
			Scanner sc = new Scanner(System.in);

			if (sc.nextInt() == 0)
				System.exit(1);

			StudentService service = new StudentServiceImpl();
			service.setDao(new StudentDAO());

			List<StudentDTO> list = service.list();

			System.out.println("""
					================================================================================
					학번	이름	주민번호	주소			입학년도	휴학여부
					--------------------------------------------------------------------------------
					""");
			for (int i = 0; i < list.size(); i++) {
				StringJoiner sj = new StringJoiner("\t");
				StudentDTO stu = list.get(i);

				sj.add(stu.getStuNo()).add(stu.getStuName()).add(stu.getStuSsn()).add(stu.getStuAddress())
						.add(stu.getDate()).add(String.valueOf(stu.getAbsYn()));

				System.out.println(sj);
			}
			System.out.println("총 학생수 : " + list.size() + " 명");

		} // while end
	}// main end
}// class end
