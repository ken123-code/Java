package CookChicken;

public abstract class nguyenLieu {
    protected int Carb;
    protected int Fat;
    protected int fatBaoHoa;
    protected int Protein;
    protected long Calo;
    protected long khoiLuong;

    public nguyenLieu(){

    }

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Moi ban nhap khoi luong: ");
        this.khoiLuong = scanner.nextLong();
    }
}
