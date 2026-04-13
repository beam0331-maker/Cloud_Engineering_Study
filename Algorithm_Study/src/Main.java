import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

		List<Integer> scores = Arrays.asList(75, 82, 68, 88);

		// 이곳에 filter, findFirst, orElse를 조합하여 결과를 구하는 코드를 작성해 보세요!
		int topScore = scores.stream().filter(i -> i>=90).findFirst().orElse(0);

		System.out.println(topScore); // 예상 출력 결과: 0

	}
}