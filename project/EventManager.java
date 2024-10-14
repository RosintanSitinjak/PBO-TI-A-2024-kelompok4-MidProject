package project;

import java.util.ArrayList;
import java.util.Scanner;

public class EventManager {
        static ArrayList<Event> events = new ArrayList<>();
        static Scanner input = new Scanner(System.in);

        public static void addEvent(){
            System.out.println("Nama Event: ");
            String namaEvent = input.nextLine();
            System.out.println("Tanggal Event: ");
            String tanggalEvent = input.nextLine();
            System.out.println("Tempat Event: ");
            String tempatEvent = input.nextLine();

            events.add(new Event(namaEvent, tanggalEvent, tempatEvent));
            System.out.println("\nEvent berhasil ditambahkan!");
            System.out.println("Kembali ke menu? (y/n): ");
            String back = input.nextLine();

            if(back.equals("y")){
                menuEvent();
            } else {
                return;
            }
        }

        public static void showEvent(){
            if (events.isEmpty()){
                System.out.println("Tidak ada event yang tersedia.");
                return;
            }

            for (int i = 0; i < events.size(); i++){
                Event event = events.get(i);
                System.out.println((i+1) + ". Nama Event: " + event.namaEvent);
                System.out.println("Tanggal Event: " + event.tanggalEvent);
                System.out.println("Tempat Event : " + event.tempatEvent);
                System.out.println(" ");
            }
            System.out.println("Kembali ke menu? (y/n): ");
            String back = input.nextLine();

            if(back.equals("y")){
                menuEvent();
            } else {
                return;
            }
        }

        public static void menuEvent(){
            System.out.println("== MENU EVENT ==");
            System.out.println("1. Tambah Event");
            System.out.println("2. Hapus Event");
            System.out.println("3. Edit Event");
            System.out.println("4. Lihat Event");
            System.out.println("0. Keluar");
            System.out.println("\nPilih Menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch(pilih){
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
                    return;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
