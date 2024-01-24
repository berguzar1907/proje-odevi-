public class proje13 {
    import java.util.Scanner;

    public class UcgenKontrol {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan üç kenar uzunluğunu al
            System.out.print("1. Kenar uzunluğunu girin: ");
            double kenar1 = scanner.nextDouble();

            System.out.print("2. Kenar uzunluğunu girin: ");
            double kenar2 = scanner.nextDouble();

            System.out.print("3. Kenar uzunluğunu girin: ");
            double kenar3 = scanner.nextDouble();

            // Üçgen olup olmadığını kontrol et
            if (isUcgen(kenar1, kenar2, kenar3)) {
                System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulabilir.");
            } else {
                System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
            }

            // Scanner'ı kapat
            scanner.close();
        }

        // Üçgen olup olmadığını kontrol eden metot
        public static boolean isUcgen(double kenar1, double kenar2, double kenar3) {
            return (kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1);
        }
    }

}
