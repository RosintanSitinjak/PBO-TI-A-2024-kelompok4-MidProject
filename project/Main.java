package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        pilihanMenu();
        System.out.println("Masukkan pilihan Anda: ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("proses");
            break;

            case 2:
                System.out.println("proses");
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
}
