package project;

import java.util.ArrayList;

import java.util.Scanner;

public class EventManager {
    static ArrayList<Event> events = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addEvent(){
        System.out.print("Nama Event: ");
        String nameEvent = input.nextLine();

        System.out.print("Tanggal Event: ");
        String dateEvent = input.nextLine();

        System.out.print("Tempat/Lokasi Event: ");
        String eventLocation = input.nextLine();

        events.add(new Event(nameEvent, dateEvent, eventLocation));
        System.out.println("Event berhasil ditambahkan");
        System.out.print("Kembali ke menu awal? (y/n): ");
        String back = input.nextLine();

        if (back.equals("y")){
            menuEvent();
        } else {
            return;
        }
    }

    public static void showEvent(){
        if (events.isEmpty()){
            System.out.println("Tidak ada event yang terdaftar");
            return;
        }

        for (int i = 0; i < events.size(); i++){
            Event event = events.get(i);

            System.out.println((i + 1) + ". Nama Event: " + event.namaEvent);
            System.out.println("Tanggal Event: " + event.tanggalEvent);
            System.out.println("Tempat Event: " + event.tempatEvent);
            System.out.println(" ");
        }

        System.out.print("Kembali ke menu? (y/n): ");
        String back = input.nextLine();

        if (back.equals("y")){
            menuEvent();
        } else {
            return;
        }
    }

    public static void menuEvent(){
        System.out.println("=== Menu Event ===");
        System.out.println("1. Tambah Event");
        System.out.println("2. Hapus Event");
        System.out.println("3. Edit Event");
        System.out.println("4. Lihat Event");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Masukkan Pilihan Menu: ");
            int choose = input.nextInt();
            input.nextLine();

            switch (choose){
                case 1:
                    addEvent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    showEvent();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid, silahkan masukkan pilihan menu kembali");

            }
    }
}