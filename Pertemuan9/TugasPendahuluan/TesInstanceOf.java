class Hewan {}
class Anjing extends Hewan {}

public class TesInstanceOf {
    public static void main(String[] args) {
        Hewan h = new Anjing();

        if (h instanceof Anjing) {
            System.out.println("Objek ini adalah anjing.");
        }
    }
}
