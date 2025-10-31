public class Kalkulator {
    public static final String TAMBAH = "tambah";
    public static final String KURANG = "kurang";
    public static final String KALI = "kali";
    public static final String BAGI = "bagi";

    private static final String PESAN_ERROR_NOL = "Error: Tidak bisa dibagi dengan nol.";
    private double hasil;

    /**
     * Konstruktor default untuk kelas Kalkulator.
     */
    public Kalkulator() {
        this.hasil = 0.0;
    }

    /**
     * Mengambil (get) hasil kalkulasi terakhir.
     * @return Nilai double yang merupakan hasil operasi terakhir.
     */
    public double getHasil() {
        return hasil;
    }

    /**
     * Metode utama untuk melakukan operasi kalkulasi.
     * @param angkaPertama Angka pertama.
     * @param angkaKedua Angka kedua.
     * @param operator String operator (tambah, kurang, kali, bagi).
     */
    public void hitung(double angkaPertama, double angkaKedua, String operator) {
        String opBersih = operator.trim().toLowerCase();

        switch (opBersih) {
            case TAMBAH:
                hasil = tambah(angkaPertama, angkaKedua);
                break;
            case KURANG:
                hasil = kurang(angkaPertama, angkaKedua);
                break;
            case KALI:
                hasil = kali(angkaPertama, angkaKedua);
                break;
            case BAGI:
                if (angkaKedua == 0) {
                    System.out.println(PESAN_ERROR_NOL);
                    return;
                }
                hasil = bagi(angkaPertama, angkaKedua);
                break;
            default:
                System.out.println("Operasi '" + operator + "' tidak dikenal.");
                return;
        }
        tampilkanHasil(opBersih);
    }

    /**
     * Melakukan Oprasi (tambah, kurang, kali, bagi) antara 2 angka.
     * @param a Angka pertama.
     * @param b angka kedua.
     * @return hasil dari perhitungan a dan b sesuai dengan oprasinya.
     */
    private double tambah(double a, double b) { return a + b; }
    private double kurang(double a, double b) { return a - b; }
    private double kali(double a, double b) { return a * b; }
    private double bagi(double a, double b) { return a / b; }

    /**
     * Menampilkan hasil operasi ke konsol.
     * @param operator Nama operasi yang sedang dijalankan.
     */
    private void tampilkanHasil(String operator) {
        System.out.println("Hasil " + operator + ": " + hasil);
        System.out.println("Operasi selesai dengan sukses.");
    }
}