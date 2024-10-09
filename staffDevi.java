public class staffDevi extends bonusTahunan{
    @Override
    public String nama() {
        return "Devi";
    }
    public String statusKaryawan() {
        return " Karyawan Tetap ";
    }
    @Override
    public String masaKerja() {
        return "38 Bulan";
    }
    protected double gajiTetap() {
        return 20000000.0;
    }
    @Override
    protected double bonusTahunan() {
        return 10000000.0;
    }
    @Override
    public String pendidikan() {
        return "S2";
    }
    @Override
    public int usia() {
        return 35;
    }
}