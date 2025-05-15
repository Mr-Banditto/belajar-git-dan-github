class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void bersuara() {
        System.out.println("Meong");
    }
}

public class Demo {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.makan();       // diwarisi dari Hewan
        k.bersuara();    // milik Kucing
    }
}
