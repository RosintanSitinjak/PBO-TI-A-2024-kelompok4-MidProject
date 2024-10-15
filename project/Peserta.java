package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Peserta {
    static ArrayList<PesertaInfo> pesertaList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);


    static class PesertaInfo {
        private String nama;
        private String nim;
        private String event;

        public PesertaInfo(String nama, String nim, String event) {
            this.nama = nama;
            this.nim = nim;
            this.event = event;
        }

        @Override
        public String toString() {
            return "Nama: " + nama + ", NIM: " + nim + ", Event: " + event;
        }
    }

    public static void lihatPeserta() {
        if (pesertaList.isEmpty()) {
            System.out.println("Tidak Ada Peserta yang Terdaftar!");
            return;
        }

        System.out.println("Daftar Peserta yang Sudah Terdaftar");
        System.out.println("=====================================");
        for (int i = 0; i < pesertaList.size(); i++) {
            PesertaInfo peserta = pesertaList.get(i);
            System.out.println((i + 1) + ". Nama: " + peserta.nama);
            System.out.println("   NIM: " + peserta.nim);
            System.out.println("   Event: " + peserta.event);
            System.out.println("--------------------------------------");
        }

        System.out.print("Ingin Kembali ke Menu Peserta? (y/n): ");
        String back = input.nextLine();
        if (back.equalsIgnoreCase("y")) {
            menuPeserta();
        }
    }


    public static void tambahPeserta() {
        System.out.println("Silahkan Masukkan Detail Peserta:");
        System.out.println("-------------------------------------");

        System.out.print("Nama Peserta: ");
        String namaPeserta = input.nextLine();

        System.out.print("NIM Peserta: ");
        String nimPeserta = input.nextLine();

        System.out.print("Event yang Diikuti: ");
        String eventPeserta = input.nextLine();

        pesertaList.add(new PesertaInfo(namaPeserta, nimPeserta, eventPeserta));
        System.out.println("Peserta Telah Berhasil Ditambahkan!");
        System.out.println("-------------------------------------");

        System.out.print("Ingin Kembali ke Menu Peserta? (y/n): ");
        String back = input.nextLine();
        if (back.equalsIgnoreCase("y")) {
            menuPeserta();
        }
    }


    public static void hapusPeserta() {
        if (pesertaList.isEmpty()) {
            System.out.println("Tidak Ada Peserta yang Terdaftar!");
            return;
        }

        System.out.println("Daftar Peserta yang Sudah Terdaftar:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < pesertaList.size(); i++) {
            PesertaInfo peserta = pesertaList.get(i);
            System.out.println((i + 1) + ". Nama: " + peserta.nama);
            System.out.println("   NIM: " + peserta.nim);
            System.out.println("   Event: " + peserta.event);
        }

        System.out.println("--------------------------------------");
        System.out.print("Masukkan Nomor Peserta yang Ingin Dihapus: ");
        int delete = input.nextInt();
        input.nextLine();

        if (delete <= 0 || delete > pesertaList.size()) {
            System.out.println("Nomor Peserta yang Anda Masukkan Tidak Valid");
            return;
        }

        pesertaList.remove(delete - 1);
        System.out.println("Peserta Telah Berhasil Dihapus!");

        System.out.print("Ingin Kembali ke Menu Peserta? (y/n): ");
        String back = input.nextLine();
        if (back.equalsIgnoreCase("y")) {
            menuPeserta();
        }
    }


    public static void menuPeserta() {
        System.out.println("====== Menu Peserta ======");
        System.out.println("1. Lihat Peserta");
        System.out.println("2. Tambah Peserta");
        System.out.println("3. Hapus Peserta");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.println("==========================");
        System.out.print("Masukkan Pilihan Menu: ");
        int choose = input.nextInt();
        input.nextLine();

        switch (choose) {
            case 1:
                Main.clearScreen();
                lihatPeserta();
                break;
            case 2:
                Main.clearScreen();
                tambahPeserta();
                break;
            case 3:
                Main.clearScreen();
                hapusPeserta();
                break;
            case 0:
                Main.clearScreen();
                Main.utama();
                break;
            default:
                System.out.println("Pilihan Menu Tidak Valid");
        }
    }
}
