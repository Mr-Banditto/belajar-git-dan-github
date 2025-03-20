public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    boolean isLulus = false;


    //Konstructor
    Mahasiswa (String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public Mahasiswa() {
    
    }

    //method/function
    public void belajar() {
            System.out.println(this.nama + " sedang belajar");
    }

    public String getNama() {
        return this.nama;
    }
   


}