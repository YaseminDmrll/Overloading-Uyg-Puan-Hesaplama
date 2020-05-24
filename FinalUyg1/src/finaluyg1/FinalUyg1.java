/*
Metotların Aşırı Yüklenmesi Yarışmacı Puanı Hesaplama Uygulaması
Verilen değerele göre yarışmacının ismini ve puanını ekrana yazdıran  3 metotdan oluşan  bir overloading uygulamasıdır.
 */

package finaluyg1;


public class FinalUyg1 {

    public static void puanHesapla(String isim,int puan)//puanHesapla adında 2 parametleri metot oluşturdum isim parametesine string, puan parametresine integer veri tipine atadım.
    {
        System.out.println(isim+" adlı yarışmacının "+puan+" puanı vardır.");//isim ve puan değişkenlerini ekrana yazdırdım.  
    }
    public static void puanHesapla(int puan)//puanHesapla adında 1 parametleri metot oluşturdum  puan parametresine integer veri tipine atadım.
    {
        System.out.println(" isimsiz yarışmacının puanı: "+puan);// puan değişkenlerini ekrana yazdırdım.  
    }
     public static void puanHesapla(String isim)//puanHesapla adında 1 parametleri metot oluşturdum isim parametesine string veri tipine atadım.
    {
        System.out.println(isim+ " adlı yarışmacının puanı bulunamadı. ");//isim değişkenlerini ekrana yazdırdım.  
    }
    
    
    
    public static void main(String[] args) {
    puanHesapla("Yasemin",100); //1. puanHesapla metoduna 2 parametrelerimizin değerini giriyoruz.
    puanHesapla(75); //2. puanHesapla metoduna puan parametremizi değerini giriyoruz.
    puanHesapla("Yasemin"); //3. puanHesapla metoduna isim parametremizi değerini giriyoruz.
    
    
    }
    
}
