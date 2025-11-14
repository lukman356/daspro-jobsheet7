import java.util.Scanner;

public class Square13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Outer loop untuk baris
        for (int iOuter = 1; iOuter <= n; iOuter++) {
            // Inner loop untuk kolom
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            // Pindah ke baris baru setelah satu baris selesai dicetak
            System.out.println();
        }

        sc.close();
    }
}