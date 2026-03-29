import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            char[] charArr = br.readLine().toCharArray();
            int count =0;

            for(int j = 0 ; j < charArr.length ; j++){
                if('(' == charArr[j]) count++;
                else count--;

                if(count < 0 ) break;
            }
            if(count !=0 ) sb.append("NO").append('\n');
            else sb.append("YES").append("\n");
        }

        System.out.println(sb);
    }
}