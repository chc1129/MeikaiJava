// 自動車クラス 【第2版】

public class Car {
    public String name;
    public int width;
    public int heigth;
    public int length;
    public double x;
    public double y;
    public double fuel;
    public Day purchaseDay;

    //--- コンストラクタ ---//
    public Car(String name, int width, int heigth, int length, double fuel,
               Day purchaseDay) {
        this.name = name;   this.width = width; this.heigth = heigth;
        this.length = length; this.fuel = fuel; x = y = 0.0;
        this.purchaseDay = new Day(purchaseDay);
    }

    public double getX() { return x; }          // 現在位置X座標を取得
    public double getY() { return y; }          // 現在位置Y座標を取得
    public double getFuel() { return fuel; }    // 残り燃料を取得
    public Day getPurchaseDay() {               // 購入日を取得
        return new Day(purchaseDay);
    }
    //--- スペック表示 ---//
    public void putSpec() {
        System.out.println("名前：" + name);
        System.out.println("車幅：" + width  + "mm");
        System.out.println("車高：" + heigth + "mm");
        System.out.println("車長：" + length + "mm");
    }

    //--- Ｘ方向にdx・Ｙ方向にdy移動 ---//
    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

        if (dist > fuel)
            return false;				// 移動できない　… 燃料不足
        else {
            fuel -= dist;				// 移動距離の分だけ燃料が減る
            x += dx;
            y += dy;
            return true;				// 移動完了
        }
    }
}
