import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        double suhu;

        do {
            System.out.println("\nMenu Konversi Suhu");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celcius");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.next().charAt(0);

            if (pilihan >= '1' && pilihan <= '3') {
                System.out.print("Masukkan suhu: ");
                suhu = input.nextDouble();

                switch (pilihan) {
                    case '1':
                        double fahrenheit = (suhu * 9/5) + 32;
                        System.out.printf("%.2f derajat Celcius = %.2f derajat Fahrenheit\n", suhu, fahrenheit);
                        break;
                    case '2':
                        double celcius = (suhu - 32) * 5/9;
                        System.out.printf("%.2f derajat Fahrenheit = %.2f derajat Celcius\n", suhu, celcius);
                        break;
                }
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        } while (pilihan != '3');

        System.out.println("Terima kasih telah menggunakan program ini!");
    }
}