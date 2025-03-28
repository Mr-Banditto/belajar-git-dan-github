
public class App {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa("deez");

        mhs.tampilkanInfo();
        System.out.println(mhs.nama);
        System.out.println(mhs.umur);

        Mahasiswa mhs2 = new Mahasiswa("miwk");
        System.out.println(mhs2.nama);
        System.out.println(Mahasiswa.universitas);

        mhs2.sayHello("miwk");

        mhs2.sayHello2("John", 49, true);
    
    }
}
