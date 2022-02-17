import java.io.Serializable;
/*
    Java Serialization:
    Java Serialization API sayesinde bir nesnenin birebir kopyasını,
    Java platformu dışında da depolayabiliriz. Bu mekanizma ile daha sonra, nesneyi depolanan yerden çekip,
    aynı durum (state) ve özellikleri ile kullanmaya devam edebiliriz.
    Tüm bu sisteme, Object Serialization (Nesne Serileştirme) adı verilir.
    Nesneleri serileştirmek için yapılması gereken tek şey,
    serileştirilecek nesnemizin serileştirilebilir (serializable) olduğunu tagging interface sayesinde sınıf deklarasyonunun başında belirtmek.

 */

public class Car implements Serializable {

    private String brand;
    private String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}