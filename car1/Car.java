// 自動車クラス 【第1版】

class Car {
    private String name;    // 名前
    private int width;      // 幅
    private int height;     // 高さ
    private int lenght;     // 長さ
    private double x;       // 現在位置X座標
    private double y;       // 現在位置Y座標
    private double fuel;    // 残り燃料

    //--- コンストラクタ ---//
    Car (String name, int width, int height, int lenght, double fuel) {
        this.name = name;       this.width = width; this.height = height;
        this.lenght = lenght;   this.fuel = fuel;
        x = y = 0.0;
    }

    double getX() { return x; }         // 現在位置Xを取得
    double getY() { return y; }         // 現在位置Yを取得
    double getFuel() { return fuel; }   // 残り燃料を取得

    //--- スペック表示 ---//
    void putSpec() {
        System.out.println("名前: " + name);
        System.out.println("車幅: " + width + "mm");
        System.out.println("車高: " + height + "mm");
        System.out.println("車長: " + lenght + "mm");
    }

    //--- X方向にdx, Y方向にdy移動 ---//
    boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy); // 移動距離

        if (dist > fuel)
            return false;   // 移動できない ...燃料不足
        else {
            fuel -= dist;   // 移動距離の分だけ燃料が減る
            x += dx;
            y += dy;
            return true;    // 移動完了
        }
    }
}
