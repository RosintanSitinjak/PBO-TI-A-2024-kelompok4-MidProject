package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Peserta {

    private static ArrayList<String> pesertaEvent = new ArrayList<>();

    static class PesertaInfo {
        private String nama;
        private String NIM;
        private String event;

        public PesertaInfo(String nama, String NIM, String event) {
            this.nama = nama;
            this.NIM = NIM;
            this.event = event;

        }
        @Override
        public String toString() {
            return "Nama: " + nama + ", NIM: " + NIM + ", Event: " + event;
        }
    }


    public static void menuPesertaEvent(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("===== Peserta Event =====");
            System.out.println("1. Daftar Peserta");
            System.out.println("2. Tambah Peserta");
            System.out.println("3. Hapus Peserta");
            System.out.println("0. Kembali ke menu utama");
            System.out.println("Masukkan pilihan anda: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Daftar Peserta Event");
                    lihatPeserta(scanner);
                    break;

                case "2":
                    System.out.println("Menambahkan peserta event");
                    tambahPeserta(scanner);
                    break;

                case "3":
                    System.out.println("Menghapus peserta event");
                    hapusPeserta(scanner);
                    break;

                case "0":
                    running = false;
                    System.out.println("Kembali ke menu utama");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }


    public static void lihatPeserta() {
        if (pesertaEvent.isEmpty()) {
            System.out.println("Belum ada peserta yang terdaftar.");
        } else {
            System.out.println("Daftar Peserta Event:");
            for (int i = 0; i < pesertaEvent.size(); i++) {
                System.out.println((i + 1) + ". " + pesertaEvent.get(i));
            }
        }
    }


    public static void tambahPeserta(Scanner scanner) {
        System.out.print("Masukkan nama peserta yang ingin ditambahkan: ");
        String namaPeserta = scanner.nextLine();
        System.out.println("Masukan NIM Peserta: ");
        String nimPeserta = scanner.nextLine();
        System.out.println("Masukkan event yang diikuti: ");
        String eventPeserta = scanner.nextLine();

        PesertaInfo peserta = new PesertaInfo(namaPeserta, nimPeserta, eventPeserta);
        pesertaEvent.add(namaPeserta);
        System.out.println("Peserta " + namaPeserta + " berhasil ditambahkan.");
    }

    public static void hapusPeserta(Scanner scanner) {
        if (pesertaEvent.isEmpty()) {
            System.out.println("Belum ada peserta yang terdaftar.");
            return;
        }

        lihatPeserta();
        System.out.print("Masukkan nomor peserta yang ingin dihapus: ");
        int nomorPeserta = scanner.nextInt();
        scanner.nextLine();
        if (nomorPeserta > 0 && nomorPeserta <= pesertaEvent.size()) {
            String pesertaDihapus = pesertaEvent.remove(nomorPeserta - 1);
            System.out.println("Peserta " + pesertaDihapus + " berhasil dihapus.");
        } else {
            System.out.println("Nomor peserta tidak valid.");
        }
    }
}
