public class sayı_asalmi {
    public static void main(String[] args) {
        int number = 3; //? Kontrol etmek istediğimiz sayıyı buraya yazıyoruz
        boolean isPrime = true; //? Başlangıçta, sayının asal olduğunu varsayıyoruz
        
        //? Bu for döngüsü, sayının asal olup olmadığını kontrol etmek için kullanılır
        //? Döngü 2'den başlar ve "number"dan bir eksik değere kadar devam eder
        for (int i = 2; i < number; i++) {
            //? Eğer sayı, i'ye tam bölünebiliyorsa (kalan 0 ise)
            if (number % i == 0) {
                isPrime = false; //? Bu durumda sayı asal değildir, isPrime'ı false yapıyoruz
                break; //? Sayı asal olmadığından, döngüyü sonlandırıyoruz
            }
        }
        
        //? Döngüden çıktıktan sonra, sayının asal olup olmadığını kontrol ediyoruz
        if (isPrime) { //? Eğer isPrime hala true ise, sayı asal demektir
            System.out.println(number + " is a prime number."); //? Asal olduğu için bu mesaj yazdırılır
        } else { //? Eğer isPrime false olduysa, sayı asal değildir
            System.out.println(number + " is not a prime number."); //? Asal olmadığı için bu mesaj yazdırılır
        }
    }
}
