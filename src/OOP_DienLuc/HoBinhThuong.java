package OOP_DienLuc;

public class HoBinhThuong extends KhachHang{
    public static final double MUC_TIEU_THU_1 = 1500;
    public static final double MUC_TIEU_THU_2 = 2000;
    public static final double MUC_TIEU_THU_3 = 2800;

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So KW tieu thu: " + this.soKW_TieuThu() + " -- Tien dien: " + this.tinhTienDien() + " -- Tien can thanh toan: " + this.tienThanhToan());
//        System.out.println("Tien dien: " + this.tinhTienDien());
//        System.out.println("Tien can thanh toan: " + this.tienThanhToan());
        System.out.println("################################");
    }

    @Override
    public double tinhTienDien() {
        if(this.soKW_TieuThu()<51){
            return this.soKW_TieuThu()*MUC_TIEU_THU_1;
        } else if (this.soKW_TieuThu()>51 && this.soKW_TieuThu()<101){
            return 50*MUC_TIEU_THU_1+(this.soKW_TieuThu()-50)*MUC_TIEU_THU_2;
        } else if (this.soKW_TieuThu()>100 ) {
            return 50*MUC_TIEU_THU_1+50*MUC_TIEU_THU_2+(this.soKW_TieuThu()-100)*MUC_TIEU_THU_3;
        }
        return 0;
    }

    @Override
    public double tinhSoKW_TieuThu() {
        return 0;
    }

    @Override
    public double tienThanhToan() {
        return this.tinhTienDien() + GTGT*this.tinhTienDien();

    }
}
