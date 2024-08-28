package OOP_DienLuc;

public abstract class KhachHang {
    private double chiSoMoi;
    private double chiSoCu;
    public static final double GTGT = 0.1;

    public KhachHang() {
        this.chiSoMoi = 0;
        this.chiSoCu = 0;
    }
    public KhachHang(double chiSoMoi, double chiSoCu) {
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
    }

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap chi so moi: ");
        this.chiSoMoi = scanner.nextDouble();
        System.out.println("Nhap chi so cu: ");
        this.chiSoCu = scanner.nextDouble();
    }

    public void xuat(){
        System.out.println("Chi so moi: "+ this.chiSoMoi +" -- Chi so cu: "+  this.chiSoCu);
    }

    public abstract double tinhTienDien();
    public abstract double tinhSoKW_TieuThu();
    public abstract double tienThanhToan();
    public double soKW_TieuThu(){
        return chiSoMoi-chiSoCu;
    }
}
