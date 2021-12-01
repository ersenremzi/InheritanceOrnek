package bolum_8_azkodcokis.test_Ogretmen;

public class Ogretmen1 {
    public static void main(String[] args) {
        Memur m1 = new Memur("Ahmet ", " Gözüpek ", 29, 123456, 5, "Fen Bilgisi");
        System.out.println(m1);
        Sozlesmeli s1 = new Sozlesmeli("Mehmet ", "Açıkalın ", 25, 789012, 2, "Geometri ", 2);
        System.out.println();
        System.out.println(s1);
    }
}

//Alt sınıflar üretmek için birbiriyle bağlantılı olması adına ilk etapta Öğretmenler diye bir class oluşturdum.

class Ogretmenler {

    private String isim;
    private String soyisim;
    private int yas;
    private long tcKimlik;
    private int yil;

    public Ogretmenler(String isim, String soyisim, int yas, long tcKimlik, int yil) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.tcKimlik = tcKimlik;
        this.yil = yil;
    }

    public Ogretmenler() {
        isim = " Henüz atanmadı";
        soyisim = " Henüz atanmadı ";
        yas = 23;
        tcKimlik = 0;
        yil = 0;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 23)
            this.yas = yas;
        else this.yas = 23;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    //Override ederek verilen değerleri değişken bazlı gözükebilmesini sağladım.

    @Override
    public String toString() {
        return "Ad : " + isim + " Soyisim : " + soyisim + " Yas : " + yas + " Tc Kimlik : " + tcKimlik + " Eğitim yılı : " + yil;
    }

}

//
class Memur extends Ogretmenler {

    private String brans; // Memur sınıfında yeni bir değişken belirterek var olan kodu güncelledim.

    public Memur(String isim, String soyisim, int yas, long tcKimlik, int yil, String brans) {
        //Burada super komutunu kullanarak kod fazlalılığından kurtulmuş oluyoruz.
        //Super komutu kullanılmadan yapacak olursak eğer ;
        //Bir önceki sınıftaki değişkenler private olarak tanımlı oldugundan dolayı hepsini burada görebilmek için
        //set komutlarını kullanmak durumunda kalırız. setYas , setİsim , setSoyisim gibi.
        super(isim, soyisim, yas, tcKimlik, yil);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return " İsim : " + getIsim() + " Soyisim : " + getSoyisim() + " Yas : " + getYas() + " Tc Kimlik : " + getTcKimlik() + " Eğitim yılı : " + getYil() + " Branşı : " + brans;
    }
}

class Sozlesmeli extends Memur {

    private int sozlesmeYılı;


    public Sozlesmeli(String isim, String soyisim, int yas, long tcKimlik, int yil, String brans, int sozlesmeYılı) {
        //Burada bir üst sınıftaki gibi super komutunu kullanarak kod fazlalılığından kurtulmuş oluyoruz.
        super(isim, soyisim, yas, tcKimlik, yil, brans);
        this.sozlesmeYılı = sozlesmeYılı;
    }

    public int getSozlesmeYılı() {
        return sozlesmeYılı;
    }

    public void setSozlesmeYılı(int sozlesmeYılı) {
        this.sozlesmeYılı = sozlesmeYılı;
    }

    @Override
    public String toString() {
        return " İsim : " + getIsim() + " Soyisim : " + getSoyisim() + " Yas : " + getYas() + " Tc Kimlik : " + getTcKimlik() + " Eğitim yılı : " + getYil() + " Branşı : " + getBrans() + " Sözleşmeli süresi : " + getSozlesmeYılı();
    }
}
