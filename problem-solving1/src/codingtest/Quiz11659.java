package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] S = new int[M+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }


        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            arr[i] = S[h] - S[k - 1];
        }

        for (int i : arr) {
            System.out.println(i);
        }



    }
}
