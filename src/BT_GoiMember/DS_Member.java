package BT_GoiMember;

import BT_DocGia.DocGia;

import java.util.ArrayList;
import java.util.List;

public class DS_Member {
    private List<Member> arr;

    public DS_Member(){
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
        System.out.println("1.Them member");
        System.out.println("2.Hien thi Danh Sach Member");
        System.out.println("3.Exit");
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
            Member a;
            if (flag==1){
                a = new Member();
                a.nhap();
                arr.add(a);
            } else if (flag==2){
                for(Member d:this.arr){
                    d.xuat();
                }
            } else {
                break;
            }
        }

//        public void xuat(){
//            for(Member d:this.arr){
//                d.xuat();
//            }
//        }

    }
}
