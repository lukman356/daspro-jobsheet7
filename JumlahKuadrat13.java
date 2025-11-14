import java.util.Scanner;

public class JumlahKuadrat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah cabang kafe
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItemTerjual = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        // Loop setiap cabang
        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("--- Cabang " + cabang + " ---");

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int cabangItemTerjual = 0;

            // Loop setiap pelanggan
            for (int pel = 1; pel <= jumlahPelanggan; pel++) {
                System.out.print("- Pelanggan " + pel + " memesan berapa item? ");
                int item = sc.nextInt();
                cabangItemTerjual += item;
            }

            // Output per cabang
            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + cabangItemTerjual + "\n");

            // Akumulasi total
            totalPelanggan += jumlahPelanggan;
            totalItemTerjual += cabangItemTerjual;
        }

        // Output total seluruh cabang
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItemTerjual + " item");

        sc.close();
    }
}
