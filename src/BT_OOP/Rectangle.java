package BT_OOP;

public class Rectangle {
    private long dai;
    private long rong;

    public Rectangle() {
        this.dai = 0;
        this.rong = 0;
    }

    public Rectangle(long dai, long rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public long getDai() {
        return dai;
    }

    public long getRong() {
        return rong;
    }

    public void setDai(long dai) {
        this.dai = dai;
    }

    public void setRong(long rong) {
        this.rong = rong;
    }

    public double tinhDienTich (){
        return dai*rong;
    }
    public double tinhChuVi (){
        return (dai+rong)*2;
    }
}
