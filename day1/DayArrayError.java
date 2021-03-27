// 日付クラスDay【第１版】の配列（その１：実行時エラー）

import java.util.Scanner;

class DayArrayError {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.print("日付は何個：");
        int n = stdIn.nextInt();

        Day[] a = new Day[n];				// 要素数n個のDay型配列

        for (int i = 0; i < a.length; i++)
            a[i].set(2027, 10, 15);		// 全要素を2027年10月15日に設定

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = "        + a[i].getYear() + "年"
                    + a[i].getMonth() + "月" + a[i].getDate() + "日("
                    + wd[a[i].dayOfWeek()] + ")");
    }
}
