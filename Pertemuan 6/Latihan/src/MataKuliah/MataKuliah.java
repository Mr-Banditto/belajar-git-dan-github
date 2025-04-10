package MataKuliah;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class MataKuliah {
    private String nama;
    private String kodeMK;

    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public MataKuliah(String nama, String kodeMK) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.pengampu = new ArrayList<>();
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }
    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }
    public String getNama() {
        return nama;
    }
    public String getKodeMK() {
        return kodeMK;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }
    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
    
}