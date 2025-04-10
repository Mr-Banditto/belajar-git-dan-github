package dosen;

public class Dosen {
    private String nama;
    private String nidn;

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }
    public String getNama() {
        return nama;
    }
    public String getNidn() {
        return nidn;
    }
}