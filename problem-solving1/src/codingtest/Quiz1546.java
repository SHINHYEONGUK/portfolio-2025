package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Quiz1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];


        double total = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
            total += arr[i];
        }

        System.out.println((total/max * 100)/N);









    }
}
