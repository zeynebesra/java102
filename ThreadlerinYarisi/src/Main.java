// Threadlerin Yarışı

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static List<Integer> even = new ArrayList<>();
    static List<Integer> odd = new ArrayList<>();
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args)
    {
        //1'den 10000 (10 bin)'e kadar olan sayılardan oluşan bir ArrayList oluşturunuz.
        for (int i = 1; i <= 10000; i++)
            numbers.add(i);

        ExecutorService executor = Executors.newFixedThreadPool(4); // Thread
        Timer  timer = new Timer();
        for (int i = 0; i < numbers.size(); i++)
            executor.execute(timer);
    }
}
