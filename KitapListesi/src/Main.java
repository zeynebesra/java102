// Kitap Listesi

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Yitik Cennet","Sezai Karakoç",125));
        books.add(new Book("Para","Necip Fazıl Kısakürek",105));
        books.add(new Book("Ulu Hakan İkinci Abdülhamid Han","Necip Fazıl Kısakürek",675));
        books.add(new Book("Sütun","Sezai Karakoç",665));
        books.add(new Book("İşaret Çocukları","Cahit Zarifoğlu",98));
        books.add(new Book("Yaşamak","Cahit Zarifoğlu",220));
        books.add(new Book("Kırk Hadis","İsmet Özel",272));
        books.add(new Book("Üç Zor Mesele","İsmet Özel",584));
        books.add(new Book("Waldo Sen Neden Burada Değilsin","İsmet Özel",240));
        books.add(new Book("Bu Ülke","Cemil Meriç",339));

        System.out.println("-------------------------------------------------------");
        System.out.println(" Kitap Listesi ");
        System.out.println("-------------------------------------------------------");
        for (Book book : books) {
            System.out.println(book.getAuthor()+" - "+book.getName() + " , " + book.getPage());
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");

        HashMap<String, String> bookAndAuthors = new HashMap<>();
        books.stream().forEach(book -> {
            bookAndAuthors.put(book.getName(), book.getAuthor());
        });

        for (String key : bookAndAuthors.keySet())
            System.out.println("Kitap Adı: " + key +" - "+ " Kitap Adı: " + bookAndAuthors.get(key));

        System.out.println("-------------------------------------------------------");

        List<Book> biggerHundered = books
                .stream()
                .filter(book -> (book.getPage() > 100))
                .collect(Collectors.toList());
        System.out.println("-------------------------------------------------------");



    }
}
