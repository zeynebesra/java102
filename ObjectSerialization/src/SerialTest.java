import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
    *ObjectOutputStream:
    -Java.io paketinin ObjectOutputStream sınıfı,
    ObjectInputStream tarafından okunabilen nesneleri yazmak için kullanılabilir.
    OutputStream soyut sınıfını enişletir.
    -Temel olarak ObjectOutputStream, sınıf adını ve nesne değerlerini kullanarak Java nesnelerini kodlar
    ve karşılık gelen akışları oluşturur. Bu süreç erileştirme (serialization) olarak bilinir.
    -Dönüştürülen akışlar dosyalarda saklanabilir ve ağlar arasında aktarılabilir.

    *ObjectInputStream:
    -Java.io paketinin ObjectInputStream sınıfı,
    daha önce ObjectOutputStream tarafından yazılmış nesneleri okumak için kullanılabilir.
     -InputStream soyut sınıfını genişletir.

 */

public class SerialTest {
    public static void main(String[] args) {
        try {
            Car car = new Car("Hyundai", "Getz");

            // ObjectOutputStream'deki nesnelerin yazıldığı bir FileOutputStream oluşturur
            FileOutputStream file = new FileOutputStream("output.txt");

            // ObjectOutputStream'i oluşturur
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(car);

            // Nesneyi Okumak
            FileInputStream fileIn = new FileInputStream("output.txt");
            ObjectInputStream read = new ObjectInputStream(fileIn);

            // Reads the objects
            Car newCar = (Car) read.readObject();

            System.out.println("Car Brand : " + newCar.getBrand());
            System.out.println("Car Model: " + newCar.getModel());

            read.close();
            write.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
