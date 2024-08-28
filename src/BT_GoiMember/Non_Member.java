package BT_GoiMember;

public class Non_Member extends Goi{
    private int HoTroPT ;

    public Non_Member() {
        setPhiCoBan(200);
        HoTroPT = 200;
    }

    public int getHoTroPT() {
        return HoTroPT;
    }

    public void setHoTroPT(int hoTroPT) {
        HoTroPT = hoTroPT;
    }

//    public void nhap (){
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//
//        System.out.println("Ho tro PT: ");
//        this.HoTroPT = scanner.nextInt();
//        super.nhap();
////        System.out.println("Nhap gia: ");
////        this.gia = scanner.nextInt();
//    }

    public void xuat(){
        System.out.println(" -- Ho tro PT: "+ this.HoTroPT );
        super.xuat();
    }
}
