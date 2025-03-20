public class Main {
    public static void main(String[] args) {
        // Membuat objek dari Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Radit", "223042", "Ilmu Komputer", 3.2);

        // Menampilkan info dari mahasiswa
        mhs1.tampilkanInfo();

        // Mengecek status kelulusan
        if (mhs1.cekLulus()) {
            System.out.println("Status  : Lulus");
        } else {
            System.out.println("Status  : Tidak Lulus");
        }
    }
}
