package project;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Event {
    String nameEvent;
    String dateEvent;
    String eventLocation;

    public Event(String name, String date, String location){
        this.nameEvent = name;
        this.dateEvent = date;
        this.eventLocation = location;
    }

    public static void main(String[] args) {
        ArrayList<Event> events = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            //Menampilkan menu pilihan
            System.out.println("Menu: ");
            System.out.println("1. Tambah Event");
            System.out.println("2. Hapus Event");
            System.out.println("3. Ubah/Edit Event");
            System.out.println("4. Lihat Semua Event");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
