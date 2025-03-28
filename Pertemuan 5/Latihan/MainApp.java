import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        // Array untuk menyimpan data mahasiswa
        Student[] daftarMahasiswa = {
            new Student("S001", "Radit", 20, 3.7),
            new Student("S002", "Riza", 20, 3.6),
            new Student("S003", "Adri", 20, 3.5),
            new Student("S004", "Hilmi", 20, 3.4),
            new Student("S005", "Umran", 20, 3.5)
        };

        // Menampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (Student mhs : daftarMahasiswa) {
            mhs.displayInfo();
        }
    }
}
