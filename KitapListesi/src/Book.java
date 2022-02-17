public class Book
{
    private String name, author;
    private int page;

    public Book(String name, String author, int page) {
        this.name = name;
        this.author = author;
        this.page = page;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Kitap Adı: "+ name +" - Sayfa Sayısı: "+page+" - Yazar: "+author);
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
