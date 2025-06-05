package antarmuka;

public abstract class Pemilik {
    String nama;

    Pemilik(String nama){
        this.nama = nama;
    }
    public abstract void PemilikKendaraan(String namaPemilik);
}
