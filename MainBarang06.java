import java.util.ArrayList;
import java.util.Scanner;
public class MainBarang06 {
    public static void main(String[] args) {
        
        Barang06 barang1 = new Barang06("K01", "Sabun", 1000, 5);
        Barang06 barang2 = new Barang06("K02", "Pasta Gigi", 2000, 10);
        Barang06 barang3 = new Barang06("K03", "Biore", 3000, 23);
        Barang06 barang4 = new Barang06("K04", "Shampoo", 4000, 55);
        Barang06 barang5 = new Barang06("K05", "Sikat Gigi", 5000, 65);

        TransaksiBarang06 transaksi = new TransaksiBarang06();
        transaksi.tambahkanBarang(barang1);
        transaksi.tambahkanBarang(barang2);
        transaksi.tambahkanBarang(barang3);
        transaksi.tambahkanBarang(barang4);
        transaksi.tambahkanBarang(barang5);
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("==========================");
            System.out.println(" TOKO MAJU MUNDUR CANTIK ");
            System.out.println("==========================");
            System.out.println(" 1. Tampilkan Barang ");
            System.out.println(" 2. Beli ");
            System.out.println(" 3. Tampilkan Pembelian ");
            System.out.println(" 4. Keluar ");
            System.out.println("==========================");
            System.out.print(" Pilih [1-4] : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    transaksi.tampilkanBarang();
                    System.out.print("Masukkan kode barang yang akan dibeli: ");
                    String kode = scanner.next();
                    System.out.print("Masukkan jumlah barang yang akan dibeli: ");
                    int jumlah = scanner.nextInt();
                    System.out.print("Apakah anda ingin menambah barang (Y/N)? ");
                    transaksi.melakukanPembelian(kode, jumlah);
                    break;
                case 3:
                    System.out.println("==========================");
                    System.out.println("     DAFTAR BELANJAAN     ");
                    System.out.println("==========================");
                    transaksi.tampilkanBarangPembelian();
                    System.out.println("==========================");
                    break;
                case 4:
                    System.out.println("Terima kasih :) ");
                    System.out.println("Selamat Datang Kembali! ");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scanner.close();
    }
}
