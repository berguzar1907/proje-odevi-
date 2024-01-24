public class proje19 {
    import java.util.ArrayList;
import java.util.List;

    class Urun {
        private String ad;
        private double fiyat;

        public Urun(String ad, double fiyat) {
            this.ad = ad;
            this.fiyat = fiyat;
        }

        public String getAd() {
            return ad;
        }

        public double getFiyat() {
            return fiyat;
        }

        @Override
        public String toString() {
            return ad + " - " + fiyat + " TL";
        }
    }

    class Musteri {
        private String ad;
        private List<Urun> sepet;

        public Musteri(String ad) {
            this.ad = ad;
            this.sepet = new ArrayList<>();
        }

        public void urunEkle(Urun urun) {
            sepet.add(urun);
            System.out.println(urun.getAd() + " sepete eklendi.");
        }

        public void sepetiGoster() {
            System.out.println(ad + "'nin Sepeti:");
            for (Urun urun : sepet) {
                System.out.println(urun);
            }
        }
    }

    class Pazaryeri {
        private List<Urun> urunler;
        private List<Musteri> musteriler;

        public Pazaryeri() {
            this.urunler = new ArrayList<>();
            this.musteriler = new ArrayList<>();
        }

        public void urunEkle(Urun urun) {
            urunler.add(urun);
            System.out.println(urun.getAd() + " pazaryerine eklendi.");
        }

        public void musteriEkle(Musteri musteri) {
            musteriler.add(musteri);
            System.out.println(musteri + " pazaryerine eklendi.");
        }

        public void urunleriListele() {
            System.out.println("Pazaryerindeki Ürünler:");
            for (Urun urun : urunler) {
                System.out.println(urun);
            }
        }

        public void musterileriListele() {
            System.out.println("Pazaryerindeki Müşteriler:");
            for (Musteri musteri : musteriler) {
                System.out.println(musteri);
            }
        }
    }

    public class PazaryeriUygulamasi {

        public static void main(String[] args) {
            Pazaryeri pazaryeri = new Pazaryeri();

            Urun elma = new Urun("Elma", 2.5);
            Urun ekmek = new Urun("Ekmek", 1.5);

            Musteri musteri1 = new Musteri("Ahmet");
            Musteri musteri2 = new Musteri("Ayşe");

            pazaryeri.urunEkle(elma);
            pazaryeri.urunEkle(ekmek);

            pazaryeri.musteriEkle(musteri1);
            pazaryeri.musteriEkle(musteri2);

            musteri1.urunEkle(elma);
            musteri2.urunEkle(ekmek);



        }
