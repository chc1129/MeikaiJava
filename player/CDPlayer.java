//===== CDプレーヤ =====//
public class CDPlayer implements Player {
    @Override public void play() { // 〇停止
        System.out.println("**CD再生開始!");
    }

    @Override public void stop() { // 〇停止
        System.out.println("**CD再生終了!");
    }

    public void cleaning() { // クリーニング
        System.out.println("**ヘッドをクリーニングしました.");
    }
}
