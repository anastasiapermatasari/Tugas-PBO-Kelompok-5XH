public class infoPegawai {
    /**
     * Menampilkan detail data pegawai.
     * @param pegawai Pegawai yang ingin ditampilkan datanya.
     */
    public static void tampilkaninfoPegawai(pegawai pegawai) {
        System.out.println("Nama pegawai: " + pegawai.nama());
        System.out.println("pendidikan: " + pegawai.pendidikan());
        System.out.println("usia: " + pegawai.usia());
    }
    public static void main(String[] args) {
        karyawanKontrak staffBudi = new staffBudi();
        tampilkaninfoPegawai(staffBudi);
        System.out.println("durasi Kontrak: " + staffBudi.durasiKontrak());
        System.out.println("gaji Kontrak: " + staffBudi.gajiKontrak());
        System.out.println();
        bonusTahunan staffDevi = new staffDevi();
        tampilkaninfoPegawai(staffDevi);
        System.out.println("masa Kerja: " + staffDevi.masaKerja());
        System.out.println("gaji tetap: " + staffDevi.gajiTetap());
        System.out.println("status Karyawan: " + staffDevi.statusKaryawan());
        System.out.println("bonus Tahunan: " + staffDevi.bonusTahunan());
        System.out.println();
    }
}