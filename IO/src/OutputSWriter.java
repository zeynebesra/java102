import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*
    * OutputStreamWriter

    -Java.io paketinin OutputStreamWriter sınıfı,
    karakter biçimindeki verileri bayt biçimindeki verilere dönüştürmek için kullanılabilir.
    Writer soyut sınıfını genişletir.

    -OutputStreamWriter sınıfı, diğer çıktı akışlarıyla çalışır.
    Bayt akışları ve karakter akışları arasında bir köprü olarak da bilinir.
    Bunun nedeni, OutputStreamWriter'ın karakterlerini bayta dönüştürmesidir.

 */
public class OutputSWriter
{
    /*
    public static void main(String[] args) {

        try {
            FileOutputStream file = new FileOutputStream("output.txt");

            OutputStreamWriter output1 = new OutputStreamWriter(file);

            OutputStreamWriter output2 = new OutputStreamWriter(file, StandardCharsets.UTF_8);

            System.out.println("Character encoding of output1: " + output1.getEncoding());
            System.out.println("Character encoding of output2: " + output2.getEncoding());

            output1.close();
            output2.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }

     */

}
