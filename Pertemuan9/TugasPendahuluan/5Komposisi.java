class Jantung {
    void detak() {
        System.out.println("Jantung berdetak.");
    }
}

class Manusia {
    private Jantung jantung = new Jantung();

    void hidup() {
        jantung.detak();
    }
}
