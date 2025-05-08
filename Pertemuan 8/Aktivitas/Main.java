

class Kendaraan { //super class / parent class
    String merk = "Toyota";

    Kendaraan() {
        System.out.println("Ini constructor parent");
    }

    void jalan(){
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan { // sub class / child class
    String merk = "BMW";

    Mobil(){
        super(); //construnctor
        System.out.println("Ini constructor child");
    }

    void printInfo(){
        System.out.println("merk mobil child " + merk);
        System.out.println("merk mobil parent " + super.merk);
        jalan();
    }

    void klakson(String merk){
        System.out.println("Mobil " + super.merk + " klakson");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        //jazz.jalan();
        jazz.printInfo();
        jazz.klakson("BMW");
        System.out.println(jazz.merk);

    }
}