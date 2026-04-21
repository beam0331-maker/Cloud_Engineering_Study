import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<List<String>> company = Arrays.asList(
                Arrays.asList("Alice:5000", "Bob:6000"),     // 개발팀
                Arrays.asList("Charlie:4500", "David:7000"), // 영업팀
                Arrays.asList("Eve:5500")                    // 기획팀
        );

        int maxSalary = company.stream()
                               .flatMap(list -> list.stream())
                               .map(str -> str.split(":")[1])
                               .mapToInt(Integer::parseInt)
                               .max()
                               .orElse(0);

        System.out.println("최고 연봉: " + maxSalary);
        // 예상 출력: 최고 연봉: 7000

    }
}