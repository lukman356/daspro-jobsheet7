import java.util.Scanner; // 3. Tambahkan library Scanner di luar kelas

public class SiakadWhile13 {

    public static void main(String[] args) { // 2. Fungsi main()
        Scanner sc = new Scanner(System.in); // 4. Deklarasi Scanner dengan variabel sc

        int nilai, jml, i = 0; // 5. Deklarasi variabel jml, nilai, i (i dimulai dari 0)

        // 6. Program untuk menerima input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        // 7. Struktur perulangan WHILE sesuai jumlah mahasiswa (i < jml)
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // 8. Validasi nilai dan klasifikasi nilai dengan IF-ELSE
            if (nilai < 0 || nilai > 100) {
                System.out.println("❌ Nilai tidak valid! Masukkan nilai antara 0 - 100.");
                continue; // kembali ke input berikutnya tanpa menaikkan i
            }

            // Jika nilai valid, tentukan kategori huruf
            if (nilai >= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println(" Bagus, pertahankan nilainya!"); // Tambahan pesan khusus untuk nilai A
            } else if (nilai >= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai >= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai >= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }

            i++; // increment sesuai perulangan
        }

        sc.close(); // tutup Scanner
    }
}
