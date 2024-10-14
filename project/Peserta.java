package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Peserta {

    private static ArrayList<String> daftarEvent = new ArrayList<>();
    private static ArrayList<String> pesertaEvent = new ArrayList<>();


    private static void cariEvent(Scanner scanner) {
        if (daftarEvent.isEmpty()) {
            System.out.println("Belum ada event yang terdaftar.");
            return;
        }

        System.out.print("Masukkan nama event yang ingin dicari: ");
        String namaEvent = scanner.nextLine();

        boolean ditemukan = false;
        for (String event : daftarEvent) {
            if (event.toLowerCase().contains(namaEvent.toLowerCase())) {
                System.out.println("Event ditemukan: " + event);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Event tidak ditemukan.");
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
        scanner.nextLine(); // Clear buffer
        if (nomorPeserta > 0 && nomorPeserta <= pesertaEvent.size()) {
            String pesertaDihapus = pesertaEvent.remove(nomorPeserta - 1);
            System.out.println("Peserta " + pesertaDihapus + " berhasil dihapus.");
        } else {
            System.out.println("Nomor peserta tidak valid.");
        }
    }

    public static void tambahEvent(String namaEvent){
        daftarEvent.add(namaEvent);
        System.out.println("Event " + namaEvent + "sudah ditambah");
    }
}