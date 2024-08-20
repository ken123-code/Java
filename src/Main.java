import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int calculateSum(int a, int b){
        return a + b;
    }

    public static int inputNumber(String name){
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int value = 0;
        while (!validInput){
            try{
                float a = 0;
                double b = 0;
                System.out.printf("Nhap %s cua ban: ", name);

//                System.out.printf("Nhap %f cua ban: ", a);
//                System.out.printf("Nhap %d cua ban: ", b);

                value = sc.nextInt();
                sc.nextLine();
                validInput = true ;
            }
            catch (Exception e) {
                System.out.println("Loi: ban phai nhap 1 so nguyen hop le.");
                sc.next();
            }
        }
        return value;
    }

    public static void nhapXuat(){
        Scanner sc = new Scanner(System.in);
                System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();

        int age = 0;
        int height = 0;
        age = inputNumber("tuoi");
        height = inputNumber("chieu cao");

        System.out.println("Ten: " + name);
        System.out.println("Chieu cao: " + height + "m");
        sc.close();
    }

    public static String getZodiacSign(int day, int month){
        if(month == 1){
            return (day <= 19 ) ? "Ma Ket": "Bao Binh";
        } else if (month == 2) {
            return (day <= 18) ? "Bao Binh": "Song Ngu";
        }  else if (month == 3) {
            return (day <= 20) ? "Song Ngu": "Bach Duong";
        }  else if (month == 4) {
            return (day <= 19) ? "Bach Duong": "Kim Nguu";
        }  else if (month == 5) {
            return (day <= 20) ? "Kim Nguu": "Song Tu";
        } else if (month == 6) {
            return (day <= 20) ? "Song Tu": "Cu Giai";
        } else if (month == 7) {
            return (day <= 22) ? "Cu Giai": "Su Tu";
        } else if (month == 8) {
            return (day <= 22) ? "Su Tu": "Xu Nu";
        } else if (month == 9) {
            return (day <= 22) ? "Xu Nu": "Thien Binh";
        } else if (month == 10) {
            return (day <= 22) ? "Thien Binh": "Bo Cap";
        } else if (month == 11) {
            return (day <= 21) ? "Bo Cap": "Nhan Ma";
        } else if (month == 12) {
            return (day <= 21) ? "Nhan Ma": "Ma Ket";
        } else {
            return "Ngay hoac thang khong hop le";
        }
    }

//    public class Array1 {
//        public static void main(String[] args) {
////            int[] numbers = {1, 2, 3, 4, 5};
////            for (int number : numbers) {
////                System.out.println(number);
////            }
////            int[][] matrix = {
////                    {1, 2, 3},
////                    {4, 5, 6},
////                    {7, 8, 9}
////            };
////            for(int i=0; i< matrix.length; i++){
////                for(int j=0; i< matrix[i].length; j++){
////                    System.out.print(matrix[i][j] + " ");
////                }
////                System.out.println();
////            }
////            int tong = 0;
////            for (int i = 0; i< matrix.length;i++){
////                tong+= matrix[i][i];
////            }
////            System.out.printf("Tong duong cheo chinh la: %d", tong);
////            System.out.println();
////            int tong1 = 0;
////            for(int i = 0; i <matrix.length; i++){
////                tong1 += matrix[i][matrix.length-i-1];
////            }
////            System.out.printf("Tong duong cheo chinh la: %d", tong1);
////        }
////    }
//
////    public static void main(String[] args) {
////
//////        Scanner scanner = new Scanner(System.in);
//////
//////        System.out.print("Nhap ten cua ban: ");
//////        String name =scanner.nextLine();
//////
//////        int age=0;
//////        try{
//////            System.out.print("Nhap tuoi cua ban:");
//////            age = scanner.nextInt();
//////            System.out.println("Tuoi: " + age);
//////        } catch (Exception e) {
////////            throw new RuntimeException(e);
//////            System.out.println(e.getMessage());
//////        }
////////        finally {
////////            System.out.print(" Loi roi ");
////////        }
//////        scanner.nextLine();
//////
//////        System.out.print("Nhap chieu cao cua ban (met): ");
//////        double height = scanner.nextDouble();
//////
//////        System.out.println("Ten: " + name);
//////        System.out.println("Chieu cao: " + height + "met");
////
//////        scanner.close();
////
//////        int a = 2, b = 3;
//////        System.out.println("a + b = "+(a+b));
//////        System.out.println("a - b = "+(a-b));
//////        System.out.println("a x b = "+(a*b));
//////        System.out.println("a % b = "+(a%b));
//////        System.out.println("a / b = "+(float)a/b);
//////        System.out.println("a / b = "+a/(float)b);
//////        System.out.println("a / b = "+a/(double)b);
//////        System.out.println("a / b = "+a*1.0/b);
//////        System.out.println("a / b = "+a/(b*1.0));
////
//////        System.out.println("sum= " + calculateSum(2,3));
//////        Scanner sc = new Scanner(System.in);
//////
//////        System.out.println("Nhap so a: ");
//////        int a = sc.nextInt();
//////        sc.nextLine();
//////
//////        System.out.println("Nhap so b: ");
//////        int b = sc.nextInt();
//////        sc.nextLine();
//////
//////        System.out.println("Nhap phep tinh: ");
//////
//////        String syntax = sc.nextLine();
//////
//////        System.out.println("Kq: ");
//////        sc.close();
////
////        nhapXuat();
////    }
//
//
//        }
//    }


    public static void main(String[] args){
        HinhChuNhat a = new HinhChuNhat(4,5);
        System.out.println("Dai = "+ a.dai);
        System.out.println("Rong = "+ a.rong);
        System.out.println("Chu vi = "+ a.ChuViHCN());
        System.out.println("Dien tich = "+ a.DienTichHCN());
    }
}
