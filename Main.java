import java.util.Scanner; // 3. Tambahkan library Scanner (luar kelas)

public class Main { // 2. Struktur dasar program Java yang terdiri dari fungsi main()

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 4. Deklarasi Scanner dengan variabel sc di dalam fungsi main()

        // 5. Deklarasi variabel
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        int totalHarga;

        // 6. Struktur perulangan DO-WHILE dengan kondisi true
        do {
            // 7. Input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // Cek kondisi keluar dari loop jika input "batal"
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; // keluar dari loop
            }

            // Input jumlah kopi, teh, dan roti
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            // Hitung total harga
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            // Tampilkan total harga yang harus dibayar
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine(); // ✅ Membersihkan newline setelah input nextInt()

        } while (true); // 6. while (true)

        System.out.println("Semua transaksi selesai.");

        sc.close();
    }
}
