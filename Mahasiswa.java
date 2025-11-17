/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa() {
        this.nim = "24183207003";
        this.nama = "Ronaa Putri Indana Zulfa"; 
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void setNim(String nim) { this.nim = nim; }
    public String getNim() { return this.nim; }
    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return this.nama; }

    public void tampilkanData() {
        System.out.println("NIM  : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.tampilkanData();
    }
}

