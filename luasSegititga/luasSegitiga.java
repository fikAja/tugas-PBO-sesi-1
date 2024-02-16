import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang sisi-sisi segitiga
        System.out.println("Masukkan panjang sisi-sisi segitiga:");
        System.out.print("Sisi A: ");
        double sisiA = scanner.nextDouble();
        System.out.print("Sisi B: ");
        double sisiB = scanner.nextDouble();
        System.out.print("Sisi C: ");
        double sisiC = scanner.nextDouble();

        // Hitung luas segitiga
        double luas = hitungLuasSegitiga(sisiA, sisiB, sisiC);

        // Hitung keliling segitiga
        double keliling = hitungKelilingSegitiga(sisiA, sisiB, sisiC);

        // Output hasil perhitungan
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);

        scanner.close();
    }

    // Fungsi untuk menghitung luas segitiga menggunakan rumus Heron
    public static double hitungLuasSegitiga(double sisiA, double sisiB, double sisiC) {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    // Fungsi untuk menghitung keliling segitiga
    public static double hitungKelilingSegitiga(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }
}
