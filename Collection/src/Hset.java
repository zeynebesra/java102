// Collection : Verileri liste halinde tutmamızı
// sağlayan yapı (array gibi)

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
SET INTERFACE
Aynı elemanların veri kümesi içinde tekrar bulunmasına izin vermez.
HashSet Sınıfı
Liste tipinde veri tutmayı sağlar.
 Veri kümesindeki elemanlara ekleme, silme ve erişim imkanı tanır. Veri kümesinde mükerrer değer tutmaz. Mükerrer değer tutmamayı nesnelerdeki hashCode fonksiyonunu kullanarak sağlar.
“null” değer eklemesi yapılabilir.

 */

public class Hset {
    /*
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("z");
        h.add(null);

        //h.remove("b");
        //System.out.println(h.size());

        //System.out.println(h.contains("b")); // arama yapma


        // For ya da iterator ile


        for (String s : h) {
            System.out.println("----------------");
            System.out.println(s);
        }




        // 2. Itertor kullanarak gezinmek

        Iterator<String> itr = h.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }

     */
    /*

    // LinkedHashSet : sıralama eşit oluyor.
    // öğeler arasında eklendikleri sırayla yineleme yapmamıza izin verir.

    public static void main(String[] args) {
        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Pazartesi");
        days.add("Salı");
        days.add("Çarşamba");
        days.add("Perşembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");

        //days.remove("Pazar");

        for (String day : days) {
            System.out.println(day);
        }

    }

     */

}
