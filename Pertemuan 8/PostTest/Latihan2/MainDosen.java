package Latihan2;

class Orang {
    Orang() {
        System.out.println("Orang dibuat");
    }
}

class Dosen extends Orang {
    Dosen() {
        super(); // panggil constructor dari Orang
        System.out.println("Dosen dibuat");
    }
}

public class MainDosen {
    public static void main(String[] args) {
        Dosen d = new Dosen();
    }
}