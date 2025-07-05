package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Quiz18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String first = st.nextToken();

            switch (first) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.remove()).append('\n');
                    break;

                case "size":
                    sb.append(q.size()).append('\n');
                    break;

                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peekFirst()).append('\n');
                    break;

                case "back":
                    sb.append(q.isEmpty() ? -1 : q.peekLast()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
