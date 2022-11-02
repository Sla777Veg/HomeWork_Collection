import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Supermarket {
    private static List <String> NAMES = List.of("Вася", "Коля","Петя","Митя","Саша","Анна","Вася", "Коля","Петя","Митя","Саша","Анна");
    private final static Random RANDOM = new Random();
    private final Queue<String> firstRegistry = new LinkedList<>();
    private final Queue<String> secondRegistry = new LinkedList<>();


    public void addPerson(String NAMES) {
        if (firstRegistry.size() ==5 && secondRegistry.size() ==5) {
            System.out.println("Позовите Галю");
        } else {
            int firstRegistrySize = firstRegistry.size();
            int secondRegistrySize = secondRegistry.size();
            int min = Math.min(firstRegistrySize, secondRegistrySize);
            if (min == firstRegistrySize) {
                firstRegistry.add(NAMES);
            } else{
                secondRegistry.add(NAMES);
            }
        }
    }
    public final void remove() {
        if (RANDOM.nextBoolean()&& firstRegistry.size() > 0) {
            firstRegistry.poll();
        } else {
            secondRegistry.poll();
        }
    }

    public Queue<String> getFirstRegistry() {
        return firstRegistry;
    }

    public Queue<String> getSecondRegistry() {
        return secondRegistry;
    }

    public Supermarket(List <String> NAMES) {
        this.NAMES = NAMES;
    }

    public static List<String> getNAMES() {
        return NAMES;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "firstRegistry=" + firstRegistry +
                ", secondRegistry=" + secondRegistry +
                '}';
    }
}



