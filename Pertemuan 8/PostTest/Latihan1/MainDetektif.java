package Latihan1;

class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama dari kelas ini      : " + nama);
        System.out.println("Nama dari kelas induk    : " + super.nama);
    }
}

public class MainDetektif {
    public static void main(String[] args) {
        GedungSekolah sekolah = new GedungSekolah();
        sekolah.tampilkanInfo();
    }
}