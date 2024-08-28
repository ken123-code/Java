package BT_DocGia;

import javax.print.Doc;

public abstract class DocGia {


    private int soThang;
    private long gia;

    public DocGia(){
    }

    public DocGia(int soThang, long gia) {
        this.soThang = soThang;
        this.gia = gia;
    }

    public int getSoThang() {
        return soThang;
    }

    public long getGia() {
        return gia;
    }


    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap so thang: ");
        this.soThang = scanner.nextInt();
        System.out.println("Nhap gia: ");
        this.gia = scanner.nextInt();
    }

    public void xuat(){
        System.out.println("So thang: "+ this.soThang +" -- So gia: "+ this.gia);
    }

    abstract long tinhTien();
}
