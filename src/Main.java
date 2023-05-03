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
        Collections.sort(nums2);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums2) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Set<String> set = new HashSet<>(strings);
        System.out.println(set);
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size() - uniqueWords.size());
    }
}