package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        pilihanMenu();
        System.out.println("Masukkan pilihan Anda: ");
        int choice = input.nextInt();


    }

    public static void pilihanMenu(){
        System.out.println("========== Sistem Manajemen Event ==========");
        System.out.println("1. Tambah Event");
        System.out.println("2. Hapus Event");
        System.out.println("3. Edit Detail Event");
        System.out.println("4. Lihat Semua Event");
        System.out.println("5. Cari Event");
        System.out.println("6. Daftar Peserta Event");
        System.out.println("7. Tambah Peserta Event");
        System.out.println("8. Hapus Peserta Event");
        System.out.println("9. Lihat Total Peserta");
        System.out.println("10. Lihat Detail Peserta");
        System.out.println("x. Keluar ");
    }
}
