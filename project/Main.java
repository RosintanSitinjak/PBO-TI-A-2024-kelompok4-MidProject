package project;

import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.events.Event;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    ArrayList<Event1> eventList = new ArrayList<>();

    public static void main(String[] args) {
        utama();

    }

    public static void utama(){
        pilihanMenu();
        System.out.print("Masukkan pilihan Anda: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                clearScreen();
                Event2.menuEvent();
                break;

            case 2:
                clearScreen();
                Peserta.menuPesertaEvent(scanner);
                break;


            default:
                System.out.println("Pilih dari pilihan 1-x");
        }
    }

    public static void pilihanMenu(){
        System.out.println("========== Sistem Manajemen Event ==========");
        System.out.println("1. Event");
        System.out.println("2. Peserta Event");
        System.out.println("3. Lihat Total Peserta");
        System.out.println("4. Lihat Detail Peserta");
        System.out.println("x. Keluar ");
    }

    // clear screen
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
