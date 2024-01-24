public class proje2 {
    import java.util.Scanner;

    public class PalindromKontrol {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan bir kelime girmesini iste
            System.out.print("Bir kelime girin: ");
            String kelime = scanner.nextLine();

            // Palindrom kontrolü yap
            if (isPalindrom(kelime)) {
                System.out.println(kelime + " bir palindrom kelime.");
            } else {
                System.out.println(kelime + " bir palindrom kelime değil.");
            }

            // Scanner'ı kapat
            scanner.close();
        }

        // Palindrom kontrolü yapan metot
        public static boolean isPalindrom(String kelime) {
            // Küçük harflere çevir ve gereksiz boşlukları temizle
            kelime = kelime.toLowerCase().replaceAll("\\s", "");

            // Kelimenin tersini al
            String tersKelime = new StringBuilder(kelime).reverse().toString();

            // Kelimenin kendisi ile tersi karşılaştır
            return kelime.equals(tersKelime);
        }
    }

}
