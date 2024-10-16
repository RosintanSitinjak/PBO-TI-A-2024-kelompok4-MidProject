package project;

import java.util.ArrayList;
import java.util.Scanner;

import static project.Event2.events;

public class Peserta {
    static ArrayList<PesertaInfo> pesertaList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static class PesertaInfo {
        String nama;
        String nim;
        int eventpilih;

        public PesertaInfo(String nama, String nim, int eventpilih) {
            this.nama = nama;
            this.nim = nim;
            this.eventpilih = eventpilih;
        }

        public static void lihatPeserta() {
            if (pesertaList.isEmpty()) {
                System.out.println("Tidak Ada Peserta yang Terdaftar!");
                menuPeserta();
            }

            System.out.println("Daftar Peserta yang Sudah Terdaftar");
            System.out.println("=====================================");
            for (int i = 0; i < pesertaList.size(); i++) {
                PesertaInfo peserta = pesertaList.get(i);

                System.out.println((i + 1) + ". Nama: " + peserta.nama);
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
            String nama = input.nextLine();

            System.out.print("NIM Peserta: ");
            String nim = input.nextLine();

            if (events.isEmpty()) {
                System.out.println("Belum ada event yang tersedia...");
            }

            System.out.println("DAFTAR EVENT");
            for (int i = 0; i < events.size(); i++) {
                Event1 event = events.get(i);

                System.out.println("_________________________________");
                System.out.println((i + 1) + ". Nama Event: " + event.nameEvent);
                System.out.println("   Tanggal Event: " + event.dateEvent);
                System.out.println("   Tempat/Lokasi Event: " + event.eventLocation);
                System.out.println("---------------------------------");
            }
            System.out.print("Event yang Diikuti (nomor): ");
            int eventpilih = input.nextInt() - 1;
            input.nextLine();

            if (eventpilih >= 0 && eventpilih < Event2.events.size()) {
                Event1 event = events.get(eventpilih);
                PesertaInfo peserta = new PesertaInfo(nama, nim, eventpilih);
                pesertaList.add(peserta);
                event.tambahPeserta(peserta);
                System.out.println("Peserta berhasil ditambahkan!");
                System.out.println("-------------------------------------");
            } else {
                System.out.println("Event tidak ditemukan");
            }

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
                System.out.println("   Event: " + peserta.eventpilih);
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
            } else {
                return;
            }
        }

        public static void lihatTotalPeserta() {
            if (events.isEmpty()) {
                System.out.println("Belum ada event yang tersedia");
                menuPeserta();
            }
            for (Event1 event : events) {
                System.out.println("Nama Event: " + event.getnameEvent() + "\nTotal Peserta: " + event.getPesertaList().size());
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
}
