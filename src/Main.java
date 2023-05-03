import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums2) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);
    }

    public static void task3() {
        System.out.println("Задача 3");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Set<String> set2 = new HashSet<>(strings);
        System.out.println(set2);
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            int counter = 0;
            for (String string : strings) {
                if (strings.get(i).equals(string)) {
                    map.put(strings.get(i), counter++);
                }
            }
        }
        System.out.println(map);
    }
}