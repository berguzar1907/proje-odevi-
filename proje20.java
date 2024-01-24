public class proje20 {
    import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

    public class soru_20 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Doğum tarihinizi (GG.AA.YYYY) formatında giriniz: ");
            String dogumTarihiString = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            try {

                Date dogumTarihi = dateFormat.parse(dogumTarihiString);

                String gunAdi = getGunAdi(dogumTarihi);


                System.out.println("Doğduğunuz gün: " + gunAdi);
            } catch (ParseException e) {
                System.out.println("Geçersiz tarih formatı! (GG.AA.YYYY)");
            }

            scanner.close();
        }
        public static String getGunAdi(Date tarih) {
            String[] gunler = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
            int gunIndex = tarih.getDay();

            return gunler[gunIndex];
        }
    }

}
