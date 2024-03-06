import java.util.ArrayList;
import java.util.Scanner;
public class Barang06 {
    String kode ;
    String nama;
    double harga;
    int stok;

    public Barang06(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanBarang() {
        System.out.println("=================================");
        System.out.println("         DAFTAR BARANG           ");
        System.out.println("=================================");
        System.out.printf("| %-5s | %-15s | %-10s | %-5s |\n", "Kode", "Nama", "Harga", "Stok");
        System.out.println("=================================");
        System.out.printf("| %-5s | %-15s | %-10.0f | %-5d |\n", kode, nama, harga, stok);
        System.out.println("=================================");
    
    }    
}
