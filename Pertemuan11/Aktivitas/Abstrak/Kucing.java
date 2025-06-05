package Abstrak;

abstract  class Kucing extends Hewan {

    Kucing(String nama){
        super(nama);
    }

    @Override
    void bersuara(){
        System.out.println("Suara Kucing Berisik");
    }

    abstract void lari();
}
