import java.util.Scanner;
import java.time.LocalDate;

public class menghitungUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tahun kelahiran
        System.out.print("Masukkan tahun kelahiran: ");
        int tahunKelahiran = scanner.nextInt();

        // Mendapatkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear();

        // Hitung umur
        int umur = hitungUmur(tahunKelahiran, tahunSekarang);

        // Output umur
        System.out.println("Umur Anda adalah " + umur + " tahun.");

        scanner.close();
    }

    // Fungsi untuk menghitung umur berdasarkan tahun kelahiran dan tahun sekarang
    public static int hitungUmur(int tahunKelahiran, int tahunSekarang) {
        return tahunSekarang - tahunKelahiran;
    }
}
