package BT_GoiMember;

public class Goi extends Member {

    private int PhiCoBan ;

    public Goi() {
        PhiCoBan = 0;
    }

    public Goi(int phiCoBan) {
        PhiCoBan = phiCoBan;
    }


//    private int ChiPhiLopHoc;
//    private int SoLuongLopHoc ;
//    private int DV_XongHoi ;
//    private int HoTroPT ;

    public int getPhiCoBan() {
        return PhiCoBan;
    }

    public void setPhiCoBan(int phiCoBan) {
        PhiCoBan = phiCoBan;
    }

    public void nhap (){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap phi can ban: ");
        this.PhiCoBan = scanner.nextInt();
        super.nhap();
//        System.out.println("Nhap gia: ");
//        this.gia = scanner.nextInt();
    }

    public void xuat(){
        System.out.println(" -- Phi Co Ban: "+ this.PhiCoBan);
    }

}
