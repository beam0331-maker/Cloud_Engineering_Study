package exam17_유틸리티;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 날짜 얻기
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		
		// 과거로
		LocalDate today2 = today.minusDays(2);
		LocalDate today3 = today.minusMonths(1);
		LocalDate today4 = today.minusYears(1);
		
		System.out.println(today2);
		System.out.println(today3);
		System.out.println(today4);
		
		LocalDate today5 = today.plusDays(2);
		LocalDate today6 = today.plusMonths(1);
		LocalDate today7 = today.plusYears(1);
		
		System.out.println(today5);
		System.out.println(today6);
		System.out.println(today7);
		
		// 특정 날짜 설정
		LocalDate my = LocalDate.of(2036, 10, 10);
		System.out.println(my);
		
		// str -----> LocalDate
		String str = "2026-12-24";	// "2026년 12월 24일"
		
		LocalDate my2 = LocalDate.parse(str);
		System.out.println(my2);
		
		String str2 = "2026년12월24일";	// "2026년 12월 24일"		
		LocalDate my3 = LocalDate.parse(str2,DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
		System.out.println(my3);
		
		String str3 = "2026/12/24";	// "2026년 12월 24일"		
		LocalDate my4 = LocalDate.parse(str3,DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(my4);
		
		
	}

}
