package Latihan1;

class Hewan {
    String suara = "Suara hewan";
}

class Kucing extends Hewan {
    String suara = "Meong";

    void tampilkanSuara() {
        System.out.println("suara milik kelas Kucing: " + this.suara);
        System.out.println("suara milik kelas Hewan: " + super.suara);
    }
}

public class TesSuara {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.tampilkanSuara();
    }
}