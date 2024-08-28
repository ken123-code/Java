package BT_GoiMember;

public class Member {
    private String TenKH;
    private int CCCD;
    private int thang;

    public Member(String tenKH, int CCCD, int thang) {
        TenKH = tenKH;
        this.CCCD = CCCD;
        this.thang = thang;
    }

    public Member() {
        TenKH = "tenKH";
        this.CCCD = 0;
        this.thang = 0;
    }

    public String getTenKH() {
        return TenKH;
    }

    public int getCCCD() {
        return CCCD;
    }

    public int getThang() {
        return thang;
    }



    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }



    public void nhap (){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        this.TenKH = scanner.nextLine();
        System.out.println("Nhap CCCD: ");
        this.CCCD = scanner.nextInt();
        System.out.println("Nhap so thang: ");
        this.thang = scanner.nextInt();
        System.out.println("Cac Goi Dich Vu: ");
        System.out.println("1: Basic ");
        System.out.println("2: Premium ");
        System.out.println("3: Member ");
        Goi a;
        int Select = 0;
        System.out.println("Vui Long Nhap Goi Dich Vu Ban Chon: ");
        Select = scanner.nextInt();
        if(Select==1){
            a = new Basic();
            a.xuat();
        } else if(Select==2) {
            a = new Premium();
            a.xuat();
        } else if(Select==3) {
            a = new Non_Member();
            a.xuat();
        }
//        System.out.println("Nhap gia: ");
//        this.gia = scanner.nextInt();
    }

    public void xuat(){
        System.out.println(" -- Ten khach hang: "+ this.TenKH + " -- CCCD: "+ this.CCCD + " -- So thang DK: "+ this.thang );
    }
}
