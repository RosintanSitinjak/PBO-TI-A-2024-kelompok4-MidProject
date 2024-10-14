package project;


public class Event1 {
    String namaEvent;
    String tanggalEvent;
    String tempatEvent;

    public Event1(String namaEvent, String tanggalEvent, String tempatEvent) {
        this.namaEvent = namaEvent;
        this.tanggalEvent = tanggalEvent;
        this.tempatEvent = tempatEvent;
    }
}

//    //method menampilkan
//    public static void showEvent(ArrayList<Event> eventList) {
//
//        System.out.println("Nama Event: " + nameEvent);
//        System.out.println("Tanggal Event: " + dateEvent);
//        System.out.println("Lokasi Event: " + eventLocation);
//    }

    //method untuk menampilkan nama event di daftar
//    public String getNameEvent() {
//        return nameEvent;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        Event event = new Event();
//
//        ArrayList<Event> eventList = new ArrayList<>();
//        int choose;
//
//        do {
//            choose = showMenu(scanner);
//
//            switch (choose) {
//                case 1:
//                    inputEvent(scanner, eventList);
//                    break;
//
//                case 2:
//                    editEvent(scanner, eventList);
//                    break;
//
//                case 3:
////                    removeEvent(scanner, eventList);
//                    break;
//
//                case 4:
//                    showEvent(eventList);
//                    break;
//
//                case 0:
//                    System.out.println("Kembali ke Menu Awal");
//                    break;
//
//                default:
//                    System.out.println("Maaf, pilihan anda tidak valid silahkan coba lagi");
//                    break;
//            }
//        } while (choose != 0);
//
//        scanner.close();
//    }
//
//    //method untuk tampilan menu
//    public static int showMenu(Scanner scanner){
//        System.out.println("Manajemen Event");
//        System.out.println("1. Tambah Event");
//        System.out.println("2. Ubah/Edit Event");
//        System.out.println("3. Hapus Event");
//        System.out.println("4. Lihat Event");
//        System.out.println("0. Kembali ke Menu Awal");
//        System.out.print("Pilihlah Menu: ");
//            return scanner.nextInt();
//    }
//
//    //method untuk tambah event
//    public static void inputEvent(Scanner scanner, ArrayList<Event> eventList){
//        scanner.nextLine();
//
//        System.out.println("Masukkan nama Event: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Masukkan tanggal event: ");
//        String date = scanner.nextLine();
//
//        System.out.println("Masukkan tempat/lokasi event: ");
//        String location = scanner.nextLine();
//
//        //tambah event baru
//        eventList.add(new Event(name, date, location));
//        System.out.println("Event telah berhasil ditambahkan");
//    }
//
//    //method untuk mengedit
//    public static void editEvent(Scanner scanner, ArrayList<Event> eventList){
//        if (eventList.isEmpty()){
//            System.out.println("Tidak ada event yang terdaftar/ditambahkan");
//        } else {
//            System.out.println("Daftar Event yang Sudah di Tambahkan: ");
//            for (int i = 0; i < eventList.size(); i++) {
//                System.out.println((i + 1) + ". " + eventList.get(i).getNameEvent());
//            }
//
//            System.out.println("Pilihlah nomor event yang ingin di edit: ");
//            int editEvent = scanner.nextInt() - 1;
//            scanner.nextLine();
//
//            if (editEvent >= 0 && editEvent < eventList.size()) {
//                System.out.println("Masukkan nama event yang baru: ");
//                String newName = scanner.nextLine();
//
//                System.out.println("Masukkan tanggal event yang baru: ");
//                String newDate = scanner.nextLine();
//
//                System.out.println("Masukkan lokasi event yang baru: ");
//                String newLocation = scanner.nextLine();
//
//                eventList.set(editEvent, new Event(newName, newDate, newLocation));
//                System.out.println("Event telah berhasil diedit");
//            } else {
//                System.out.println("pilhan anda tidak valid, silahkan coba kembali");
//            }
//        }
//
//    }
//
//}
//
//
//
//
//
