package study.jaeworkspace.baekjoon.w01;

import java.io.*;

/**
 * 빠른 A+B
 */
public class NO15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopCount; i++) {
            String[] testCases = br.readLine().split(" ");

            bw.write(Integer.valueOf(testCases[0]) + Integer.valueOf(testCases[1]) + "\n");
        }
        br.close();

        bw.flush();
        br.close();
    }
}
