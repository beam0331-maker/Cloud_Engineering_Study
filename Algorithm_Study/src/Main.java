import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            char[] line = br.readLine().toCharArray();
            if (line[0] == '.') break;
            if (isCheck(line)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }

    static boolean isCheck(char[] line) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();
        List<Character> keylist = new ArrayList<>(map.keySet());

        for (char c : line) {
            if(keylist.contains(c))
                stack.push(map.get(c));
            else if(c == ')'|| c == '}'||c == ']'){
                if(stack.isEmpty() || stack.pop() != c)
                    return  false;
            }
        }
        return stack.isEmpty();
    }
}