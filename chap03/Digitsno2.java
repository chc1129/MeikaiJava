// 読み込んだ整数値の桁数(2桁以上かどうか)を判定

import java.util.Scanner;

class Digitsno2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値: ");
        int n = stdIn.nextInt();

        if (n <= -10 || n >= 10)            // 2桁以上
            System.out.println("2桁以上です.");
        else                                // 2桁未満
            System.out.println("2桁未満です.");
    }
}
