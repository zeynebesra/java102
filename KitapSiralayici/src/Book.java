/*
Kitap Sıralayıcı :
Book isminde bir sınıf tasarlayınız.
Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.
Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır
 */

public class Book implements Comparable<Book> {
    private String name;
    private String publishDate;
    private int pageNumber;
    private  String authorName;

    public Book(String name, String publishDate, int pageNumber, String authorName) {
        this.name = name;
        this.publishDate = publishDate;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public int compareTo(Book book) {
        if (this.pageNumber > book.pageNumber) {
            return 1;
        } else if (this.pageNumber == book.pageNumber) {
            return 0;
        } else {
            return -1;
        }
    }
}
