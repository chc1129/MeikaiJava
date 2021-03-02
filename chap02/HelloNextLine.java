// 名前を読み込んで挨拶する (その2: nextLine()版)
import java.util.Scanner;

class HelloNextLine {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("お名前は: ");
        String str = stdin.nextLine(); // 1行分の文字列を読み込む

        System.out.println("こんにちは" + str + "さん.");
    }
}
