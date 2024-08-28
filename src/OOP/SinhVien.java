package OOP;

public class SinhVien {
    private String ten;
    private float toan;
    private float van;

    public SinhVien() {
        this.ten = " ";
        this.toan = 0;
        this.van = 0;
    }

    public SinhVien(String ten, float toan, float van) {
        this.ten = ten;
        this.toan = toan;
        this.van = van;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public void setVan(float van) {
        this.van = van;
    }
    public float getToan() {
        return toan;
    }

    public float getVan() {
        return van;
    }

    public String getTen() {
        return ten;
    }

    public void Xuat(){
        System.out.println("Ho Ten: "+ this.ten + "-- Toan: "+ this.toan + "-- Van: "+ this.van);
    }

    public float dtb(){
        return (this.toan+this.van)/2;
    }

    public float dtb(SinhVien a){
        return (this.dtb()+a.dtb())/2;
    }

    public float dtb(SinhVien a, SinhVien b){
        return (this.dtb()+a.dtb()+b.dtb())/3;
    }

}


