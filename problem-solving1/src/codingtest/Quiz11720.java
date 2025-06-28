package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        char[] arr = s.toCharArray();

        int total = 0;

        for (char c : arr) {
            total += c - '0';
        }
        System.out.println(total);

    }
}
