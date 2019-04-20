import entity.*;
import service.*;
import java.util.*;

public class App {

    private static ServiceKaryawan service;
    private static Scanner scanner;

    public static void main(String[] args){
        service = new ServiceKaryawan();

        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            }catch(Exception e){
                System.err.println("Inputan berupa pilihan 1-5 !");
                opsi = 0;
            }
            prosesMenu(opsi);
        } while (opsi !=5);
    }

    private static void prosesMenu(int opsi) {
        switch (opsi){
            case 1 :
                formTambahData();
                break;
            case 2 :
                formUbahData();
                break;
            case 3 :
                formHapusData();
                break;
            case 4 :
                service.cetakData();
                break;
        }
    }

    private static void formHapusData(){
        System.out.println("\nForm Hapus Data");
        scanner = new Scanner(System.in);
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.hapusData(id);
    }

    private static void formUbahData(){
        String id, nama, divisi, jk, agama, alamat;
        System.out.println("\nForm Tambah Data");
        scanner = new Scanner(System.in);
        System.out.print("ID            : ");
        id = scanner.nextLine();
        System.out.print("NAMA          : ");
        nama = scanner.nextLine();
        System.out.print("DIVISI        : ");
        divisi = scanner.nextLine();
        System.out.print("JENIS KELAMIN : ");
        jk = scanner.nextLine();
        System.out.print("AGAMA         : ");
        agama = scanner.nextLine();
        System.out.print("ALAMAT        : ");
        alamat = scanner.nextLine();
        service.ubahData(new Karyawan(id, nama, divisi, jk, agama, alamat));
    }

    private static void formTambahData() {
        String id, nama, divisi, jk, agama, alamat;
        System.out.println("\nForm Tambah Data");
        scanner = new Scanner(System.in);
        System.out.print("ID            : ");
        id = scanner.nextLine();
        System.out.print("NAMA          : ");
        nama = scanner.nextLine();
        System.out.print("DIVISI        : ");
        divisi = scanner.nextLine();
        System.out.print("JENIS KELAMIN : ");
        jk = scanner.nextLine();
        System.out.print("AGAMA         : ");
        agama = scanner.nextLine();
        System.out.print("ALAMAT        : ");
        alamat = scanner.nextLine();
        simpanDataBaru(new Karyawan(id, nama, divisi, jk, agama, alamat));
    }

    private static void simpanDataBaru(Karyawan kry){
        service.tambahData(kry);
    }

    private static void cetakMenu(){
        System.out.println("|-----------------------------------|");
        System.out.println("|    Aplikasi CRUD Data Karyawan    |");
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("|         1. Tambah Data            |");
        System.out.println("|         2. Ubah Data              |");
        System.out.println("|         3. Hapus Data             |");
        System.out.println("|         4. Tampilkan Data         |");
        System.out.println("|         5. KELUAR                 |");
        System.out.println("|                                   |");
        System.out.println("|-----------------------------------|");
        System.out.println("|        Tiara Arista Hasanah       |");
        System.out.println("|          17090010     4B          |");
        System.out.println("|-----------------------------------|");
        System.out.print("Pilihan > ");
    }
}