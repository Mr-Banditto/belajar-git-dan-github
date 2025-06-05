package antarmuka;

public class Mobil extends Pemilik implements Kendaraan, Pabrik {
    Mobil(String nama){
        super(nama);
    }

    @Override
    public void nyalakanMesin(){
        System.out.println("Mobil menyala");
    }  
    @Override
    public void matikanMesin(){
        System.out.println("Mobil mati");
    }

    @Override
    public void produksiKendaraan(){
        System.out.println("mobil di produksi");
    }

    @Override
    public void PemilikKendaraan(String namaPemilik){
        System.out.println(namaPemilik + " punya mobil bagus");
    }
}
