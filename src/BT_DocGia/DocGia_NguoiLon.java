package BT_DocGia;

public class DocGia_NguoiLon extends DocGia {

    private String so_CCCD;

    public DocGia_NguoiLon(){
        this.setGia(10000);
    }

    public void setSo_CCCD(String so_CCCD) {
        this.so_CCCD = so_CCCD;
    }

    public String getSo_CCCD() {
        return so_CCCD;
    }

    @Override
    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap so CCCD: ");
        this.so_CCCD = scanner.nextLine();
        super.nhap();
    }

    @Override
    public void xuat(){
        System.out.println("So can cuoc cong dan: "+ this.so_CCCD);
        super.xuat();
    }

    @Override
    public long tinhTien(){
        return getGia()*getSoThang();
    }
}
