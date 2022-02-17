import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        //forEach() : akışın bütün elemanlarını konsola yazdırıyoruz.
        //list.stream().forEach(number -> System.out.println(number));

        // filter() : Bu metodu kullanarak akışın elemanlarını filtreleyebilir
        //list.stream().filter(number -> number > 60).forEach(number -> System.out.println(number));

        // distinct() : Bu metodu kullanarak akışın içinde her elemanın en fazla 1 kez yer almasını sağlayabilirsiniz.
        // Eğer akışın içinde bir eleman daha önce tanımlanmışsa, ikinci kez yer almaz. Parametre almaz.
        //list.stream().distinct().forEach(number -> System.out.println(number));

        // sorted() : Bu metodu kullanarak akışın elemanlarını sıralayabilirsiniz.
        //list.stream().sorted().forEach(number -> System.out.println(number));
        //System.out.println("--------------------");
        //list.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number)); //tersi

        //limit() : Bu metodu kullanarak akış üzerinde gerçekleştireceğiniz işlemleri belli bir sayıyla sınırlandırabilirsiniz.
        // long türünde bir sayıyı parametre olarak alır.
        //System.out.println("--------------------");
        //list.stream().limit(5L).forEach(number -> System.out.println(number)); //yalnızca ilk 5 elemanın konsola yazdırıldı.

        // skip(): Bu metodu kullanarak akışın belli sayıda elemanını atlayabilirsiniz. Bu elemanlar üzerinde işlem yapılmaz.
        // long türünde bir sayıyı parametre olarak alır.
        //list.stream().skip(5L).limit(2L).forEach(number -> System.out.println(number)); // akışın ilk 5 elemanını atlıyor ve sonraki 2 elemanı konsola yazdırıyoruz:


        // count() : Bu metodu kullanarak akıştaki eleman sayısını öğrenebilirsiniz.
        // Bu metot akışı sonlandıran bir metottur, yani bu metodu kullandıktan sonra akış üzerinde başka bir işlem yapamazsınız.
        //40’tan küçük kaç farklı sayı olduğunu konsola yazdırıyoruz.
        /*
        long count = list
                .stream()
                .filter(number -> number < 40)
                .distinct()
                .count();
        System.out.println(count);
         */

        // anyMatch() : Predicate<T> türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular.
        // Elemanlardan herhangi biri bu testten geçiyorsa true, aksi halde false döndürür.
        // Bu metot akışı sonlandıran bir metottur, yani bu metodu kullandıktan sonra akış üzerinde başka bir işlem yapamazsınız.
        /*
        boolean match = list
                .stream()
                .anyMatch(number -> number < 5);
        System.out.println(match);
         */
        // listenin içinde 5’ten küçük sayı olup olmadığını test ediyoruz.
        // Listede 5’ten küçük yalnızca 3 vardır; fakat bu bile metodun true döndürmesi için yeterlidir.
        // Bu kodu çalıştırırsanız konsola true yazar.


        // allMatch() : Predicate<T> türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular.
        // Elemanların tamamı bu testten geçiyorsa true, aksi halde false döndürür.
        // Bu metot akışı sonlandıran bir metottur, yani bu metodu kullandıktan sonra akış üzerinde başka bir işlem yapamazsınız.
        /*
        boolean match = list
                .stream()
                .allMatch(number -> number < 5);
        System.out.println(match); // Bu kodu çalıştırırsanız konsola false yazar; çünkü listede 5’ten büyük elemanlar da vardır.

         */

        // noneMatch() : Predicate<T> türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular.
        // Elemanların hiçbiri bu testten geçmiyorsa true, aksi halde false döndürür.
        // Bu metot akışı sonlandıran bir metottur, yani bu metodu kullandıktan sonra akış üzerinde başka bir işlem yapamazsınız.
        /*
        boolean match = list
                .stream()
                .noneMatch(number -> number < 5);
        System.out.println(match); // çünkü listede 5’ten küçük elemanlar vardır.
         */

        // map() : Akışın elemanlarını değiştirmek için bu metodu kullanabilirsiniz.
        // Function<T,R> türünde bir parametre alır ve bu fonksiyonu akışın bütün elemanlarına uygular.
        // Akışın yeni elemanları bu metottan dönen değerlerdir.

        list.stream().map(number -> number * 2).forEach(number -> System.out.println(number)); //  akışın bütün elemanlarını 2 ile çarptık.







    }
}
