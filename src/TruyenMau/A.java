package TruyenMau;

public class A extends NhomMau {
    public A(){
        this.loaiMau = _A;
    }

    @Override
    public boolean kiemTraDichuyen(NhomMau cha, NhomMau con) {
        return false;
    }

    @Override
    public boolean kiemTraNhomMau(NhomMau nhan) {
        return false;
    }
}
