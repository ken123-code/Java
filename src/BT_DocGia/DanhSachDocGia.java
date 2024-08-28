package BT_DocGia;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DanhSachDocGia {
        private List<DocGia> arr;

        public DanhSachDocGia(){
            this.arr = new ArrayList<>();
        }

        public void nhap(){
//            DocGia a = new DocGia_TreEm();
//            a.nhap();
//            arr.add(a);
//
//            DocGia b = new DocGia_NguoiLon();
//            b.nhap();
//            arr.add(b);

            int flag = 1;
            System.out.println("1.Nhap DG tre em");
            System.out.println("2.Nhap DG nguoi lon");
            System.out.println("3.So Luong DG Tre Em");
            System.out.println("4.Exit");
            System.out.println("###############################");

//            while (true){
//                System.out.println("Moi ban nhap lua chon");
//                java.util.Scanner scanner = new java.util.Scanner(System.in);
//                flag = scanner.nextInt();
//                DocGia a;
//                if (flag==1){
//                    a = new DocGia_TreEm();
//                } else if (flag==2){
//                    a = new DocGia_NguoiLon();
//                } else {
//                    break;
//                }
//                a.nhap();
//                arr.add(a);
//            }

            while (true){
                System.out.println("Moi ban nhap lua chon");
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                flag = scanner.nextInt();
                DocGia a;
                if (flag==1){
                    a = new DocGia_TreEm();
                    a.nhap();
                    arr.add(a);
                } else if (flag==2){
                    a = new DocGia_NguoiLon();
                    a.nhap();
                    arr.add(a);
                } else if (flag==3){
                    System.out.println("So luong doc gia tre em: " + demSL_DG_TreEm());
                } else {
                    break;
                }
            }
        }

        public void xuat(){
            for(DocGia d:this.arr){
                d.xuat();
            }
        }

        public long tongTien(){
            long tong = 0;
            for(DocGia d:this.arr){
                tong+=d.tinhTien();
            }
            return tong;
        }

        public long demSL_DG_TreEm(){
            int count=0;
            for(DocGia a: this.arr){
                if(a instanceof DocGia_TreEm){
                    count++;
                }
            }
            return count;
        }



}
