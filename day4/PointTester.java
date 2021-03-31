// 2次元座標クラスと3次元座標クラス

// 2次元座標クラス
class Point2D {
    int x; // X座標
    int y; // Y座標

    Point2D(int x, int y) { this.x = x; this.y = y; }

    void setX(int x) { this.x = x; }    // X座標を取得
    void setY(int y) { this.y = y; }    // Y座標を取得

    int getX() { return x; }    // X座標を取得
    int getY() { return y; }    // Y座標を取得
}

// 3次元座標クラス
class Point3D extends Point2D {
    int z;  // Z座標

    Point3D(int x, int y, int z) { super(x, y); this.z = z; }

    void setZ(int z) { this.z = z; } // Z座標を設定
    int getZ() { return z; }        // Z座標を取得
}

public class PointTester {
    public static void main(String[] args) {
        Point2D a = new Point2D(10, 15);
        Point3D b = new Point3D(20, 30, 40);

        System.out.printf("a = (%d, %d)\n", a.getX(), a.getY()) ;
        System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
    }
}