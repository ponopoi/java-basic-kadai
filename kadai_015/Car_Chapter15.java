package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;
    private int speed = 10;

    // ギアチェンジするメソッド
    public void gearChange(int afterGear) {
        int beforeGear = this.gear; // ギアチェンジ前のギアを保存
        this.gear = afterGear;

        // ギアに応じて速度を変更
        switch (afterGear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10;
                break;
        }
        // ギアチェンジしたことを「ギア1から3に切り替えました」と表示
        System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
    }

    // 走行するメソッド
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}

