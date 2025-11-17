
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 10
 */
public class MainClaas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int pilihan = 0;
        
        do {
            System.out.println("\n===== MENU DATA MAHASISWA =====");
            System.out.println("1. Menambah data");
            System.out.println("2. Menampilkan semua data");
            System.out.println("3. Keluar dari program");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Mahasiswa ---");
                    
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();

                    
                    Mahasiswa mhsBaru = new Mahasiswa(nim, nama); 
                    
                   
                    daftarMahasiswa.add(mhsBaru); 
                    
                    System.out.println("Data Mahasiswa BERHASIL ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Semua Data Mahasiswa ---");
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data yang diinput.");
                    } else {
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            mhs.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid! Silakan coba lagi.");
                    break;
            }

        } while (pilihan != 3);
        
        input.close();
    }
}
