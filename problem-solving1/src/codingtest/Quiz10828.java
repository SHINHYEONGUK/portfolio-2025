package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Quiz10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String input = st.nextToken();

            switch (input) {
                case "push":
                    s.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(s.empty() ? -1 : s.pop()).append('\n');
                    break;

                case "size":
                    sb.append(s.size()).append('\n');
                    break;

                case "empty":
                    sb.append(s.empty() ? 1 : 0).append('\n');
                    break;

                case "top":
                    sb.append(s.empty() ? -1 : s.peek()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}

