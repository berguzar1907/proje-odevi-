public class proje10 {
    import java.util.Scanner;

    public class AsalSayilar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan başlangıç ve bitiş değerlerini al
            System.out.print("Başlangıç değerini girin: ");
            int baslangic = scanner.nextInt();

            System.out.print("Bitiş değerini girin: ");
            int bitis = scanner.nextInt();

            // Asal sayıları ekrana yazdır
            System.out.println("Asal Sayılar " + baslangic + " ile " + bitis + " arasında:");
            asalSayilariYazdir(baslangic, bitis);

            // Scanner'ı kapat
            scanner.close();
        }

        // Belirli bir aralıktaki asal sayıları bulup ekrana yazdıran metot
        public static void asalSayilariYazdir(int baslangic, int bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                if (isAsal(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        // Bir sayının asal olup olmadığını kontrol eden metot
        public static boolean isAsal(int sayi) {
            if (sayi <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

}
