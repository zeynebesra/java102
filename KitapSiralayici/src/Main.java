import java.util.*;
 /*
 Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.

 Sonra ikinci kez Set tipinden bir veri yapısı kullanın
 ve kitapları sayfa sayısına göre sıralamasını sağlayınız.
  */
public class Main {
    public static void main(String[] args) {
        Set<Book> ts = new TreeSet<>();
        //5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.

        ts.add(new Book("Yitik Cennet","2020",125,"Sezai Karakoç"));
        ts.add(new Book("Para","1998",105,"Necip Fazıl Kısakürek"));
        ts.add(new Book("Sütun","2021",665,"Sezai Karakoç"));
        ts.add(new Book("İşaret Çocukları","2019",98,"Cahit Zarifoğlu"));
        ts.add(new Book("Kırk Hadis","2020",272,"İsmet Özel"));

        // Sıralama

        System.out.println("---------------------------------------");
        System.out.println(" Kitap Listesi ");
        System.out.println("---------------------------------------");
        for (Book book : ts) {
            System.out.println(book.getAuthorName()+" - "+book.getName() + " , " + book.getPageNumber());
        }
        System.out.println(" ");

        System.out.println("---------------------------------------");


        // kitapları sayfa sayısına göre sıralamasını

        System.out.println("---------------------------------------");
        System.out.println(" Kitap Listesi (sayfa sayısına göre) ");
        System.out.println("---------------------------------------");

        Set<Book> newTreeSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()- o2.getPageNumber();
            }
        });
        newTreeSet.addAll(ts);
        for (Book book : newTreeSet) {
            System.out.println(book.getName() + ", " + book.getPageNumber());
        }




    }
}
