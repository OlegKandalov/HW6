import java.util.*;

public class Array {
    public static void main(String[] args) {

    }
    public void task1() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("green");
        arrayList.add("red");
        arrayList.add("black");
        arrayList.add("white");

        System.out.println(arrayList);
    }

    public void task2(List<String> list) {
        for (String color : list) {
            System.out.println(color);
        }
    }

    public void task3(List<String> list, String addedWord) {
        list.add(0, addedWord);
        System.out.println(list);
    }

    public void task4(List<String> list, int index) {
        System.out.println(list.get(index));
    }

    public void task5(List<String> list, int index, String word) {
        list.set(index, word);
        System.out.println(list);
    }

    public void task6(List<String> list) {
        list.remove(3);
        System.out.println(list);
    }

    public void task7(List<String> list, String searchThisWord) {
        for (String word : list) {
            if (word.equals(searchThisWord)) {
                System.out.println("I find this word, this is - " + word);
            }
        }
    }

    public void task8(List<String> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public void task9(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        System.out.println(list1);
    }

    public void task10(List<String> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }

    public void task11(List<String> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    public void task12(List<String> list, int start, int end) {
        System.out.println(list.subList(start, end));
    }

    public void task13(List<String> list, List<String> list2) {
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list.equals(list2));
    }

    public void task14(List<String> list, int first, int second) {
        String temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
        System.out.println(list);
    }

    public void task15(List<String> first, List<String> second) {
        List<String> result = new LinkedList<>(first);
        result.addAll(second);
        System.out.println(result);
    }

    public void task16(ArrayList<String> original) {
        ArrayList<String> cloned = new ArrayList<>(original);
        // or ArrayList<String> cloned2 = (ArrayList<String>) original.clone();
        System.out.println(cloned);
    }

    public void task17(List<String> list) {
        list.clear();
        System.out.println(list);
    }

    public void task18(List<String> list) {
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);
    }

    public void task19(ArrayList<String> list, int capacity) {
        list.trimToSize();
        System.out.println(list);
    }

    public void task20(ArrayList<String> list, int newSize) {
        list.ensureCapacity(newSize);
        System.out.println(list);
    }

    public void task21(List<String> list, String newWord) {
        list.set(1, newWord);
        System.out.println(list);
    }

    public void task22(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
