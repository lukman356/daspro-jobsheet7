import java.util.Scanner;

public class NilaiKelompok13 {
    public static void main(String[] args) {
        int i, j, nilai;
        float totalNilai, rataNilai;

        // Variabel untuk mencari kelompok terbaik
        float rataTertinggi = -1; 
        int kelompokTerbaik = -1;

        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 6; i++) {
            totalNilai = 0; // reset nilai tiap kelompok
            
            for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai untuk Kelompok " + i + 
                                 " dari penilai ke-" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai Kelompok " + i + " = " + rataNilai);

            // Cek apakah ini rata-rata tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTerbaik = i;
            }
        }

        // Tampilkan hasil akhir
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Kelompok dengan nilai rata-rata tertinggi adalah Kelompok " 
                           + kelompokTerbaik);
        System.out.println("Dengan rata-rata: " + rataTertinggi);

        sc.close();
    }
}
