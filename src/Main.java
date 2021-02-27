import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedTest = new LinkedList<>();
        List<Integer> arrayTest = new ArrayList<>();

        long linkedlisttime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedTest.add(new Integer(i));
        }
        System.out.println("Время работы LinkedList(в миллисекундах) 1,000,000 чисел = " + (System.currentTimeMillis() - linkedlisttime1));

        long arraylisttime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayTest.add(new Integer(i));
        }

        System.out.println("Время работы ArrayList(в миллисекундах) 1,000,000 чисел = " + (System.currentTimeMillis() - arraylisttime1));

        System.out.println("--------------------------");

        long linkedlisttime2 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            linkedTest.add(new Integer(i));
        }

        System.out.println("Время работы LinkedList(в миллисекундах) 10,000,000 чисел = " + (System.currentTimeMillis() - linkedlisttime2));

        long arraylisttime2 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            arrayTest.add(new Integer(i));
        }

        System.out.println("Время работы ArrayList(в миллисекундах) 10,000,000 чисел = " + (System.currentTimeMillis() - arraylisttime2));
    }
}
