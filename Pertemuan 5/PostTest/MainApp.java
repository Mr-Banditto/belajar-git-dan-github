// Kelas induk Person
class Person {
    private String name;
    private int age;

    // Konstruktor untuk menginisialisasi atribut
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method untuk menampilkan nama dan umur
    public void printInfo() {
        System.out.println("Nama: " + name + ", Umur: " + age);
    }
}

// Kelas Employee yang merupakan turunan dari Person
class Employee extends Person {
    private double salary;

    // Konstruktor Employee, memanggil konstruktor Person
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Method untuk menampilkan gaji
    public void printSalary() {
        System.out.println("Gaji: Rp" + salary);
    }

    // Method untuk menampilkan semua informasi karyawan
    public void printEmployeeInfo() {
        printInfo();  // Memanggil method dari Person
        printSalary();
    }
}

// Kelas utama untuk menjalankan program
public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Employee dan langsung mencetak informasinya
        Employee karyawan1 = new Employee("Vania", 19, 5000000);
        karyawan1.printEmployeeInfo();
    }
}
