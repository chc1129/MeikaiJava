//===== DVDプレーヤ =====//
public class DVDPlayer implements ExPlayer {

    @Override public void play() { // 〇再生
        System.out.println("--DVD再生開始!");
    }

    @Override public void stop() { // 〇停止
        System.out.println("--DVD再生終了!");
    }

    @Override public void slow() { // ●スロー再生
        System.out.println("--DVDスロー再生開始!");
    }
}
