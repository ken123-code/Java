//package TruyenMau;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DanhSachNhomMau {
//    private List<NhomMau> arr;
//
//    public DanhSachNhomMau() {
//        this.arr = new ArrayList<>();
//    }
//
//    public void nhap(){
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        System.out.println("Moi ban nhap so luong");
//        int n = scanner.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println("Nhap thong tin nguoi thu "+ i+1);
//            System.out.println("1. Nhom O");
//            System.out.println("2. Nhom A");
//            System.out.println("3. Nhom B");
//            System.out.println("4. Nhom AB");
//            System.out.println("Moi ban lua chon nhom mau");
//            int flag = scanner.nextInt();
//
//            if(flag == 1){
//                NhomMau x = new O();
//                x.nhap();
//                this.arr.add(x);
//            } else if (flag == 2) {
//                NhomMau x = new A();
//                x.nhap();
//                this.arr.add(x);
//            } else if (flag == 3) {
//                NhomMau x = new B();
//                x.nhap();
//                this.arr.add(x);
//            } else if (flag == 4) {
//                NhomMau x = new AB();
//                x.nhap();
//                this.arr.add(x);
//            }
//        }
//    }
//    public void xuat(){
//        for(NhomMau x: this.arr){
//            x.xuat();
//        }
//    }
//
//    public static void main(String[] args) {
//        DanhSachNhomMau a = new DanhSachNhomMau();
//        a.nhap();
//        a.xuat();
//    }
//}
