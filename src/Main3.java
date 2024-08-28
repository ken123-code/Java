import BT_OOP.Rectangle;
import OOP_DienLuc.DS_KhachHang;

public class Main3 {
    public static void main(String[] args) {
//        Rectangle a = new Rectangle(2,3);
//        System.out.println("Dai = "+ a.getDai());
//        System.out.println("Rong = "+ a.getRong());
//        System.out.println("Chu vi hinh chu nhat: "+ a.tinhChuVi());
//        System.out.println("Dien tich hinh chu nhat: "+ a.tinhDienTich());
        DS_KhachHang a = new DS_KhachHang();
        a.nhap();
        System.out.println("################################");
        System.out.println("Tat ca cac ho can thanh toan tien dien: ");
        a.xuat();
        System.out.println("################################");
        System.out.println("Tong tien can thanh toan cua cac ho: "+ a.tongTien());
        System.out.println("################################");
        a.thanhToanMax();

    }
}
