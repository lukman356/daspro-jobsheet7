import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        double total = 0; // total biaya parkir

        System.out.println("=== Program Perhitungan Parkir ===");
        System.out.println("Masukkan jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("Ketik 0 untuk selesai.\n");

        // Perulangan input selama jenis kendaraan bukan 0
        do {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            // Jika 0 → keluar dari loop
            if (jenis == 0) {
                System.out.println("\nInput selesai.\n");
                break;
            }

            // Input durasi parkir
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            // Validasi input negatif
            if (durasi < 0) {
                System.out.println("Durasi parkir tidak boleh negatif. Silakan input ulang!\n");
                continue;
            }

            double bayar = 0;

            // Logika tarif berdasarkan flowchart
            if (durasi > 5) {
                bayar = 12500;
            } else {
                if (jenis == 1) { // Mobil
                    bayar = durasi * 3000;
                } else if (jenis == 2) { // Motor
                    bayar = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid!\n");
                    continue;
                }
            }

            // Tambahkan ke total semua kendaraan
            total += bayar;

            System.out.println("Biaya parkir kendaraan ini: Rp " + String.format("%,.0f", bayar));
            System.out.println("------------------------------------\n");

        } while (true);

        // Tampilkan total akhir
        System.out.println("=== Rekap Total Pembayaran Parkir ===");
        System.out.println("Total biaya semua kendaraan: Rp " + String.format("%,.0f", total));
        System.out.println("Terima kasih telah menggunakan layanan parkir kami!");

        sc.close();
    }
}
