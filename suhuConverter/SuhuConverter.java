import java.util.Scanner;

public class SuhuConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input suhu dalam Reamur
        System.out.print("Masukkan suhu dalam Reamur: ");
        double reamur = scanner.nextDouble();

        // Konversi suhu
        double celcius = reamurToCelcius(reamur);
        double fahrenheit = reamurToFahrenheit(reamur);
        double kelvin = reamurToKelvin(reamur);

        // Output hasil konversi
        System.out.println("Hasil konversi:");
        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
        
        scanner.close();
    }

    // Fungsi konversi Reamur ke Celcius
    public static double reamurToCelcius(double reamur) {
        return reamur * 5 / 4;
    }

    // Fungsi konversi Reamur ke Fahrenheit
    public static double reamurToFahrenheit(double reamur) {
        double celcius = reamurToCelcius(reamur);
        return celcius * 9 / 5 + 32;
    }

    // Fungsi konversi Reamur ke Kelvin
    public static double reamurToKelvin(double reamur) {
        double celcius = reamurToCelcius(reamur);
        return celcius + 273.15;
    }
}
