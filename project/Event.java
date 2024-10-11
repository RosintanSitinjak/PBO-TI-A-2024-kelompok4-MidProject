package project;


import java.util.ArrayList;
import java.util.Scanner;

public class Event {
    private String nameEvent;
    private String dateEvent;
    private String eventLocation;

    public Event(String name, String date, String location) {
        this.nameEvent = name;
        this.dateEvent = date;
        this.eventLocation = location;
    }


    //method menampilkan
    public void showEvent() {
        System.out.println("Nama Event: " + nameEvent);
        System.out.println("Tanggal Event: " + dateEvent);
        System.out.println("Lokasi Event: " + eventLocation);
    }

    //method untuk menampilkan nama event di daftar
    public String getNameEvent() {
        return nameEvent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Event event = new Event();

        ArrayList<Event> eventList = new ArrayList<>();
        int choose;

        do {
            //tampilan menu
            System.out.println("Manajemen Event");
            System.out.println("1. Tambah Event");
            System.out.println("2. Edit Event");
            System.out.println("3. Hapus Event");
            System.out.println("4. Lihat Event");
            System.out.println("0. Kembali ke Menu Awal");

            System.out.println("Pilihlah Menu: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    //tambah
                    System.out.println("Masukkan Nama Event: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.println("Masukkan Tanggal Event: ");
                    String date = scanner.nextLine();

                    System.out.println("Masukkan Lokasi Event: ");
                    String location = scanner.nextLine();

                    //menambahkan event baru lagi
                    eventList.add(new Event(name, date, location));
                    System.out.println("Event Telah Berhasil Ditambahkan!");
                    break;

                case 2:
                    //edit
//                    System.out.println("Masukkan Nama Event yang Baru: ");
//                    String newName = scanner.nextLine();
//
//                    System.out.println("Masukkan Tanggal Event yang Baru: ");
//                    String newDate = scanner.nextLine();
//
//                    System.out.println("Masukkan Lokasi Event yang Baru: ");
//                    String newLocation = scanner.nextLine();
//
//                    event.inputEvent(newName, newDate, newLocation);
//                    break;
                    if (eventList.isEmpty()) {
                        System.out.println("Tidak ada event yang terdaftar untuk diedit");
                    } else {
                        System.out.println("Pilihlah nomor event yang ingin diedit: ");

                        for (int i = 0; i < eventList.size(); i++){
                            System.out.println((i + 1) + ". " + eventList.get(i).getNameEvent());
                        }

                        int editEvent = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (editEvent >= 0 && editEvent < eventList.size()){
                            System.out.println("Masukkan Nama Event yang Baru: ");
                            String newName = scanner.nextLine();

                            System.out.println("Masukkan Tanggal Event yang Baru: ");
                            String newDate = scanner.nextLine();

                            System.out.println("Masukkan Lokasi Event yang Baru: ");
                            String newLocation = scanner.nextLine();

                            eventList.set(editEvent, new Event(newName, newDate, newLocation));
                            System.out.println("Event telah berhasil diedit");
                        } else {
                            System.out.println("Pilihan anda tidak valid/tidak ada terdaftar");
                        }
                    }
                    break;

                case 3:
                    if (eventList.isEmpty()){
                        System.out.println("Tidak ada event yang terdaftar");
                    } else {
                        System.out.println("Pilih nomor event yang ingin dihapus: ");

                        for (int i = 0; i < eventList.size(); i++){
                            System.out.println((i + 1) + ". " + eventList.get(i).getNameEvent());
                        }

                        int removeEvent = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (removeEvent >= 0 && removeEvent < eventList.size()){
                            eventList.remove(removeEvent);
                            System.out.println("Event telah berhasil dihapus!");
                        } else {
                            System.out.println("Pilihan anda tidak valid");
                        }
                    }
                    break;

                case 4:
                    //menampilkan
                    if (eventList.isEmpty()){
                        System.out.println("Tidak ada event yang ditambahkan/terdaftar");
                    } else {
                        for (int i = 0; i < eventList.size(); i++){
                            System.out.println("Event ke- " + ( i + 1) + ": ");
                            eventList.get(i).showEvent();
                        }
                    }
                    break;

                case 0:
                    //kembali ke menu awal
                    System.out.println("Ketik 0 Untuk Kembali ke Menu Awal");
                    break;

                default:
                    System.out.println("Maaf, Pilihan Anda Tidak Valid, Silahkan Coba Kembali");
            }
        }
        while (choose != 5);

        scanner.close();
    }
}



