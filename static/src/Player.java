public class Player {

    /*
    Static deyimi, sınıf değişkenlerini ve ya sınıf metotlarını tanımlarken kullanılır.
    Eğer bir sınıfa ait değişkenlerin başına "static" yazılırsa, o değişkenler artık sınıf değişkeni olurlar.
    Sınıf değişkeni olarak tanımlanan değişkenler, her nesne oluşturduğumuzda ayrı ayrı oluşmazlar.
    Sınıfa ait ne kadar nesne olursa olsun, sınıf değişkenleri 1 tanedir.
    Sınıfa ait herhangi bir nesne üzerinden bu değişkene ulaşılabilir
     */
    public String name;
    public int id;

    static int onlinePlayers; // nesneden bağımsız değişken

   public Player(String name,int id) {
       this.name= name;
       this.id = id;
        onlinePlayers++;
    }

}
