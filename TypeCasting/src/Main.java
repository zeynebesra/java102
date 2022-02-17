
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------");

        System.out.println("Widening Casting (Otomatik)");
        int myInt = 3;
        double myDouble = myInt; // Otomatik Dönüştürme : int => double

        System.out.println(myInt);      // Çıktısı 3
        System.out.println(myDouble);   // Çıktısı 3.0

        System.out.println("-----------------------------");

        System.out.println("Narrowing Casting (Manuel)");
        double myDouble2 = 3.78;
        int myInt2 = (int) myDouble; // Manuel Dönüştürme : double => int

        System.out.println(myDouble2);   // Çıktısı 3.78
        System.out.println(myInt2);      // Çıktısı 3

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        System.out.println("String => Integer Dönüşümü");
        String data = "15";
        System.out.println("String Değer : " + data);

        int num = Integer.parseInt(data);
        System.out.println("Integer Değer : " + num);

        System.out.println("-----------------------------");

        System.out.println("Integer => String Dönüşümü");
        int num2 = 10;
        System.out.println("Integer değer : " + num2);

        String data2 = String.valueOf(num);
        System.out.println("String Değer :  " + data2);

    }
}
