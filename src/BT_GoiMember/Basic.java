package BT_GoiMember;

public class Basic extends Goi{
    private int ChiPhiLopHoc;
//    private int SoLuongLopHoc ;
    private int HoTroPT ;

    public Basic() {
        setPhiCoBan(500);
        ChiPhiLopHoc = 100;
        HoTroPT = 100;
    }

    public int getChiPhiLopHoc() {
        return ChiPhiLopHoc;
    }

    public int getHoTroPT() {
        return HoTroPT;
    }

    public void setChiPhiLopHoc(int chiPhiLopHoc) {
        ChiPhiLopHoc = chiPhiLopHoc;
    }

    public void setHoTroPT(int hoTroPT) {
        HoTroPT = hoTroPT;
    }

//    public void nhap (){
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        System.out.println("Nhap chi phi lop hoc: ");
//        this.ChiPhiLopHoc = scanner.nextInt();
//        System.out.println("Ho tro PT: ");
//        this.HoTroPT = scanner.nextInt();
//        super.nhap();
////        System.out.println("Nhap gia: ");
////        this.gia = scanner.nextInt();
//    }

    public void xuat(){
        super.xuat();
        System.out.println(" -- Chi phi lop hoc: "+ this.ChiPhiLopHoc +" -- Ho tro PT: "+ this.HoTroPT );
    }
}
