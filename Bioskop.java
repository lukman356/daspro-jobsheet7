import java.util.Scanner;

public class Bioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket;
        int hargaTiket = 50000;
        double totalHargaPelanggan;
        double totalPenjualan = 0;
        int totalTiketTerjual = 0;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Ketik 0 untuk mengakhiri program.\n");

        // Perulangan utama
        do {
            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            // Jika user mengetik 0, keluar dari program
            if (tiket == 0) {
                System.out.println("\n=== Rekap Total Penjualan Hari Ini ===");
                System.out.println("Total tiket terjual : " + totalTiketTerjual + " tiket");
                System.out.println("Total pendapatan    : Rp " + String.format("%,.0f", totalPenjualan));
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                break;
            }

            // Validasi input negatif
            if (tiket < 0) {
                System.out.println(" Jumlah tiket tidak boleh negatif. Silakan input ulang!\n");
                continue; // kembali ke awal loop
            }

            // Hitung diskon tiket
            double diskon = 0.0;
            if (tiket > 10) {
                diskon = 0.15; // 15% untuk >10 tiket
            } else if (tiket > 4) {
                diskon = 0.10; // 10% untuk >4 tiket
            }

            // Hitung total harga tiket
            double hargaSebelumDiskon = tiket * hargaTiket;
            totalHargaPelanggan = hargaSebelumDiskon * (1 - diskon);

            // Tambahkan ke total harian
            totalTiketTerjual += tiket;
            totalPenjualan += totalHargaPelanggan;

            // Tampilkan hasil pembelian pelanggan
            System.out.println("\n=== Detail Pembelian ===");
            System.out.println("Jumlah Tiket   : " + tiket);
            System.out.println("Diskon Tiket   : " + (diskon * 100) + "%");
            System.out.println("Total Bayar    : Rp " + String.format("%,.0f", totalHargaPelanggan));
            System.out.println("============================\n");

        } while (true);

        sc.close();
    }
}
