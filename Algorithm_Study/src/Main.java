import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<n ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.countTokens() == 2){
                st.nextToken();
                queue.add(Integer.parseInt(st.nextToken()));
            }

            queue.


        }


    }

}