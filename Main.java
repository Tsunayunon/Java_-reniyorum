public class Main {
    public static void main(String[] args) {
        //! 'mesaj' değişkenini tanımlıyoruz ve bir değer atıyoruz
        String mesaj = "Bu bir örnek mesajdır.";

        //! 'karakterler' isminde bir char dizisi (liste) oluşturuyoruz
        char[] karakterler = new char[5];

        //! Verilen karakterin ne olduğunu söylüyor
        System.out.println("5. Karakter = " + mesaj.charAt(4));

        //! Mesaj sonuna yeni bir mesaj ekliyor
        System.out.println(mesaj.concat(" Yaşasın!"));

        //! Mesajın komutudur mesajın başında B olup olmadığını sorgulatıyor
        System.out.println(mesaj.startsWith("B"));

        //! 2. Örneği
        System.out.println(mesaj.startsWith("A"));

        //! Boolean komutudur mesajın sonunun doğru olup olmadığını sorgulatıyor
        System.out.println(mesaj.endsWith("b"));

        //! 2. Örneği
        System.out.println(mesaj.endsWith("B"));

        //! Mesaj stringini 0 ve 5. indeksi alıp karakterler indexinin maksimum index sayısına entegre eder
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        //! Verilen harf veya birleşik harflerin kaç numaralı indexte başladığını gösteriyor
        System.out.println(mesaj.indexOf("av"));

        //! Verilen harf veya birleşik harflerin kaç numaralı indexte başladığını gösteriyor (sondan)
        System.out.println(mesaj.lastIndexOf("Bu"));

        //! Sistemde belirtilen eski harfi alıp yerine yeni harf (newChar) ile dolduruyor
        String yeni_mesaj = mesaj.replace('a', '-');
        System.out.println(yeni_mesaj);

        //! Karakterlerin belirli alanını gösterir
        System.out.println(mesaj.substring(2, 5));

        //! Verilen mesajı boş diziyle listeye ekler ve altta belirttiğin şekilde yazmanı sağlıyor
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        //! Mesajın tüm harflerini büyük harf yapar
        System.out.println(mesaj.toUpperCase());

        //! Mesajın tüm harflerini küçük harf yapar
        System.out.println(mesaj.toLowerCase());

        //! Olası bir boşlukları, ön ve sonuna ait olanları kaldırarak mesajı düzeltmeye yarıyor
        System.out.println(mesaj.trim());
    }
}
