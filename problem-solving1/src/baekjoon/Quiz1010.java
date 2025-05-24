package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1010 {
    static int[][] dc;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        dc = new int[30][30];
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(factorial(m, n));

        }
    }

    static int factorial(int n, int r) {
        if (dc[n][r] > 0) return dc[n][r];

        if ( n == r || r == 0) return 1;

        return factorial(n - 1, r - 1) + factorial(n - 1, r);
    }


}
