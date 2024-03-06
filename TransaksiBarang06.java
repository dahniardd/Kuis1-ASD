import java.util.ArrayList;

public class TransaksiBarang06 {
     ArrayList<Barang06> barangs = new ArrayList<>();

    public void tambahkanBarang(Barang06 barang) {
        barangs.add(barang);
    }

    public void tampilkanBarang() {
        for (Barang06 barang : barangs) {
            barang.tampilkanBarang();
            System.out.println();
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Barang yang Dibeli:");
        tampilkanBarang();
    }

    public void melakukanPembelian(String kode, int jumlah) {
        for (Barang06 barang : barangs) {
            if (barang.kode.equals(kode)) {
                if (barang.stok >= jumlah) {
                    barang.stok -= jumlah;
                    System.out.println("Pembelian berhasil!");
                } else {
                    System.out.println("Stok barang tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak dapat ditemukan.");
    }

}


