
/*
    InputStream : InputStream sınıfı byte akışını temsil eden bir abstract sınıftır ve Java.io paketinden gelmektedir.
    * Alt sınıfları :
    FileInputStream,
    ByteArrayInputStream,
    ObjectInputStream

 */

import java.io.FileInputStream;

public class InputStream
{
    /*
    public static void main(String[] args)
    {
        try {
            FileInputStream input = new FileInputStream("patika.txt");

            System.out.println("Dosyadaki veriler: ");


            // 5 byte atlanacaktır
            //input.skip(5); // skip(); Belirtilen bayt sayısını atmak ve atlamak için skip () yöntemini kullanabiliriz.
            //System.out.println("5 bytelık veri atlandı : ");

            // İlk baytı okur
            int i = input.read();

            while (i != -1) {
                // Byte to char
                System.out.print((char) i);
                // Dosyadan sonraki baytı okur
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

     */
}

/*
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            // Kullanılabilir bayt sayısını verir
            System.out.println("Kullanılabilir bayt sayısı : " + input.available());

            // Dosyadan 3 baytlık veri okur
            input.read();
            input.read();
            input.read();

            // Kullanılabilir bayt sayısını verir
            System.out.println("Kullanılabilir bayt sayısı : " + input.available());

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
 */
