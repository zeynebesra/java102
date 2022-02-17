import java.io.File;

//File Sınıfı

public class file {
    /*
    public static void main(String[] args) {
        File file = new File("patika.txt");

        //oluşturma
        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni Dosya Oluştu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        //silme

        boolean value = file.delete();
        if (value) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }

        /*
        // dizin oluşturma
        boolean value = file.mkdir();
        if(value) {
            System.out.println("The new directory is created.");
        }
        else {
            System.out.println("The directory already exists.");
        }

         */


        /*
         //Dizindeki Elemanları Listeleme

        File file = new File("test");

        String[] fileList = file.list();

        for(String str : fileList) {
            System.out.println(str);
        }


    }

         */

}
