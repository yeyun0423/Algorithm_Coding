import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String[] answer = new String[T];
        int[] score = new int[T];

        for (int i = 0; i < T; i++) {
            answer[i] = input.next();
            int current = 0;

            for (int j = 0; j < answer[i].length(); j++) {
                if (answer[i].charAt(j) == 'O') {
                    current += 1;
                    score[i] += current;
                } else {
                    current = 0;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(score[i]);
        }
    }
}
