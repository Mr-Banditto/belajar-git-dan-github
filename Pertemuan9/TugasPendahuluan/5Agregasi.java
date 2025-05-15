
import java.util.List;

class Mahasiswa {
    String nama;
    Mahasiswa(String nama) {
        this.nama = nama;
    }
}

class Universitas {
    List<Mahasiswa> daftarMhs;

    Universitas(List<Mahasiswa> daftarMhs) {
        this.daftarMhs = daftarMhs;
    }
}
