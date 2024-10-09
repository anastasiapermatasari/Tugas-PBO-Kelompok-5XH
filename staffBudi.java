public class staffBudi extends karyawanKontrak {
    @Override
    public String nama() {
        return "Budi";
    }
    @Override
    public String durasiKontrak() {
        return "15 Bulan";
    }
    @Override
    protected double gajiKontrak() {
        return 10000000.0;
    }
    @Override
    public String pendidikan() {
        return "S1";
    }
    @Override
    public int usia() {
        return 32;
    }
}
