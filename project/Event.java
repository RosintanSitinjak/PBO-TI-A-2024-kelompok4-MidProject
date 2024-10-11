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
//            choose = showMenu(scanner);

            switch (choose) {
                case 1:
//                    inputEvent(scanner, eventList);
                    break;

                case 2:
//                    editEvent(scanner, eventList);
                    break;

                case 3:
//                    removeEvent(scanner, eventList);
                    break;

                case 4 ;
//                    ShowEvent(eventList);
                    break;

                case 0:
                    System.out.println("Kembali ke Menu Awal");
                    break;

                default:
                    System.out.println("Maaf, pilihan anda tidak valid silahkan coba lagi");
                    break;
            }
        } while (choose != 0);





