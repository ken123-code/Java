package OOP_DienLuc;

public class HoKinhDoanh extends KhachHang {
    public static final double MUC_TIEU_THU = 3000;
    public static final double TIEN_UU_DAI = 0.05;
    private int loaiHinh;

    @Override
    public void nhap() {
        super.nhap();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Loai hinh ho kinh doanh: ");
        System.out.println("1. Cong ty nha nuoc ");
        System.out.println("2. Khong phai cong ty nha nuoc ");
        this.loaiHinh = scanner.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So KW tieu thu: " + this.soKW_TieuThu() + "-- Tien dien: " + this.tinhTienDien() + "-- Tien can thanh toan: " + this.tienThanhToan());
//        System.out.print("-- Tien dien: " + this.tinhTienDien());
//        System.out.print("-- Tien can thanh toan: " + this.tienThanhToan());
        System.out.println("################################");
    }

    @Override
    public double tinhTienDien() {
        return this.soKW_TieuThu()*MUC_TIEU_THU;
    }

    @Override
    public double tinhSoKW_TieuThu() {
        return this.soKW_TieuThu();
    }

    @Override
    public double tienThanhToan() {
        if(loaiHinh==1){
            return this.tinhTienDien()+GTGT*this.tinhTienDien()-TIEN_UU_DAI*this.tinhTienDien();
        } else{
            return this.tinhTienDien()+GTGT*this.tinhTienDien()-0*this.tinhTienDien();
        }
    }
}
