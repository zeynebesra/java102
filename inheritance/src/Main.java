/*
Kalıtım (Inheritance)
Bir sınıfın başka bir sınıftan kalıtım yapması demek,
kalıtımı yapan sınıfın diğer sınıftaki nitelik
ve davranışlarını kendisine alması demektir.
Kalıtımı yapan sınıfa alt sınıf, kendisinden kalıtım yapılan sınıfa ata sınıf dersek,
 ata sınıfta tanımlı olan herşeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.
 */
public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Zeyneb Öztürk","05467899876", "info@gmail.com");
        //System.out.println(c1.getAdSoyad());
        Akademisyen a1 = new Akademisyen("Zeyneb Esra Öztürk","05467899876", "info@gmail.com", "bolum"," unvan");
        Memur m1 =new Memur("Zeyneb Öztürk","05467899876", "info@gmail.com","departman","mesai");

        System.out.println(m1.getMesai());
        m1.calis();

    }
}
