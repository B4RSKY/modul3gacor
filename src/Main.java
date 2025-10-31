import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = Double.parseDouble(scanner.nextLine());

        System.out.print("Masukkan angka kedua  : ");
        double angkaKedua = Double.parseDouble(scanner.nextLine());

        System.out.print("Masukkan operator (tambah, kurang, kali, bagi): ");
        String operator = scanner.nextLine();

        System.out.println("----------------------------------------");
        kalkulator.hitung(angkaPertama, angkaKedua, operator);

        scanner.close();
        System.out.println("Program selesai.");
    }
}