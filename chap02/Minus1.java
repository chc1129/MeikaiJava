// 整数値を読み込んで符号を反転した値を表示
import java.util.Scanner;

class Minus1 {
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        System.out.print("整数値: ");
        int a = stdInt.nextInt();   // aに整数値を読み込む

        int b = -a;             // aの符号を反転した値でbを初期化
        System.out.println(+a + "の符号を反転した値は" + b + "です.");
    }
}
