package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        double sum = 0;
        double result = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        result = (sum / max * 100) / N;

        System.out.printf("%.6f",result);

        /* 리팩토링
        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double max = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        double result = (sum / max * 100) / n;

        System.out.printf("%.6f", result);


         */


    }
}
