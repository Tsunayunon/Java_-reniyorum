public class kalın_ses_ince_ses {
    public static void main(String[] args) {

        String harf ="t";

        if (harf.equalsIgnoreCase("A") || harf.equalsIgnoreCase("I") || harf.equalsIgnoreCase("O") || harf.equalsIgnoreCase("U")) {
            System.out.println("Kalın Sesli Harf");
        } else if (harf.equalsIgnoreCase("E") || harf.equalsIgnoreCase("İ") || harf.equalsIgnoreCase("Ö") || harf.equalsIgnoreCase("Ü")) {
            System.out.println("İnce Sesli Harf");
        } else {
            System.out.println("Sesli Harf Değil");
        }





    }
}
