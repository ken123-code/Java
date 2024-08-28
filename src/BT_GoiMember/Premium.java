package BT_GoiMember;

public class Premium extends Goi{
    private String ChiPhiLopHoc;
//    private int SoLuongLopHoc ;
    private String DV_XongHoi ;
    private String HoTroPT ;

    public Premium() {
        setPhiCoBan(1000);
        ChiPhiLopHoc = "Mien Phi";
        this.DV_XongHoi = "Mien Phi";
        HoTroPT = "Mien Phi";
    }


//    public void nhap (){
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        System.out.println("Nhap chi phi lop hoc: ");
//        this.ChiPhiLopHoc = scanner.nextLine();
//        System.out.println("Nhap DV xong hoi: ");
//        this.DV_XongHoi = scanner.nextLine();
//        System.out.println("Ho tro PT: ");
//        this.HoTroPT = scanner.nextLine();
//        super.nhap();
////        System.out.println("Nhap gia: ");
////        this.gia = scanner.nextInt();
//    }

    public void xuat(){
        super.xuat();
        System.out.println(" -- Chi phi lop hoc:: "+ this.ChiPhiLopHoc +" -- DV xong hoi: "+ this.DV_XongHoi +" -- Ho tro PT: "+ this.HoTroPT );

    }
}
