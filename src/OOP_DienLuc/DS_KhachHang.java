package OOP_DienLuc;

import BT_DocGia.DocGia;

import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Double;

public class DS_KhachHang {
    private List<KhachHang> arr;

    public DS_KhachHang(){
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        int flag = 1;

        while (true){
            System.out.println("1.Nhap ho binh thuong va tinh tien dien");
            System.out.println("2.Nhap ho kinh doanh va tinh tien dien");
            System.out.println("3.Exit");
            System.out.println("###############################");
            System.out.println("Moi ban nhap lua chon");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            flag = scanner.nextInt();
            KhachHang a;
            if (flag==1){
                a = new HoBinhThuong();
                a.nhap();
                a.xuat();
                arr.add(a);
            } else if (flag==2) {
                a = new HoKinhDoanh();
                a.nhap();
                a.xuat();
                arr.add(a);
            }
            else {
                break;
            }
        }
    }

    public void xuat(){
        for(KhachHang kh:this.arr){
            kh.xuat();
        }
    }

    public long tongTien(){
        long tong = 0;
        for(KhachHang kh:this.arr){
            tong+=kh.tienThanhToan();
        }
        return tong;
    }

    public Double Max(){
        Double maxTT = 0d;
        for(KhachHang a: this.arr){
            if(maxTT<a.tienThanhToan()){
                maxTT = a.tienThanhToan();
            }
        }
        return maxTT;
    }

    public void thanhToanMax(){
        System.out.println("###############################");
        System.out.println("Khach hang thanh toan nhieu nhat: ");
        double max = Max();
        for( KhachHang a: this.arr){
            double kq = a.tienThanhToan();
            if(Double.compare(max,kq)==0){
                a.xuat();
            }
        }
//        this.arr.stream()
//                .filter(khachHang -> khachHang.tienThanhToan( )==max)
//                .forEach(khachHang -> {
//                    System.out.println("Danh sach khach hang max: " + khachHang.tienThanhToan());
//                    khachHang.xuat();
//                });
    }
}
