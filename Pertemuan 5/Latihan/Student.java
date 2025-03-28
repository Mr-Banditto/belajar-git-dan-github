package com.university.model;

public class Student {
    private String studentId;
    private String name;
    protected int age;
    public double gpa;

    // Konstruktor untuk inisialisasi atribut
    public Student(String id, String nama, int umur, double ipk) {
        this.studentId = id;
        this.name = nama;
        this.age = umur;
        this.gpa = ipk;
    }

    // Getter dan setter untuk studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String id) {
        this.studentId = id;
    }

    // Getter dan setter untuk name
    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }

    // Getter dan setter untuk age
    public int getAge() {
        return age;
    }

    public void setAge(int umur) {
        this.age = umur;
    }

    // Getter dan setter untuk gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double ipk) {
        this.gpa = ipk;
    }

    // Method untuk menampilkan data mahasiswa
    public void displayInfo() {
        System.out.println("ID: " + studentId + ", Nama: " + name + ", Umur: " + age + ", IPK: " + gpa);
    }
}
