public class Main {
    public static void main(String[] args) {
        // Mahasiswa mhs1 = new Mahasiswa("eko", "042", "Ilmu Komputer");


        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "eko";
        mhs1.nim = "042";
        mhs1.jurusan = "Ilmu Komputer";
        
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.jurusan);

        Mahasiswa mhs2 = new Mahasiswa("Budi", "001", "Informatika");
    
        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.jurusan);
    }

}
