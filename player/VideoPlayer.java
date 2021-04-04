//===== ビデオプレーヤ =====//
public class VideoPlayer implements Player {
    private int id;               // 製造番号
    private static int count = 0; // 現在までに与えられた製造番号

    public VideoPlayer() { // コンストラクタ
        id = ++count;
    }

    @Override public void play() { // 〇停止
        System.out.println("++ビデオ再生開始!");
    }

    @Override public void stop() { // 〇停止
        System.out.println("++ビデオ再生終了!");
    }

    public void printInfo() { // 製造番号表示
        System.out.println("++本気の製造番号は[" + id + "]です.");
    }
}
