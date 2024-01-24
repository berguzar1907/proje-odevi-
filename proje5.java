public class proje5 {
    import java.util.Scanner;

    public class BasamaklarınaAyırma {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            System.out.println("Bir Sayı Giriniz");
            int binler,yuzler,onlar,birler;
            Scanner klavye=new Scanner(System.in);
            int sayi=klavye.nextInt();

            binler=sayi/1000;   // Binler Basamağı
            sayi=sayi-(1000*binler);

            yuzler=sayi/100;   // Yüzler Basamağı
            sayi=sayi-(100*yuzler);

            onlar=sayi/10;    // Onlar Basamağı
            sayi=sayi-(10*onlar);

            birler=sayi;     // Birler Basamağı

            System.out.println("Sayının Basamaklarına Ayrılmış Hali " + binler + " " + yuzler + " " + onlar + " " + birler);
            System.out.println("Binler Basamağı : " + binler);
            System.out.println("Yüzler Basamağı : " + yuzler);
            System.out.println("Onlar Basamağı  : " + onlar);
            System.out.println("Birler Basamağı : " + birler);

        }

    }
}
