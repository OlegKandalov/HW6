package HW;

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

        System.out.println("new list with added elements " + arrayList);
    }

    public void task2(List<String> list) {
        System.out.println("Iteration of list: ");
        for (String color : list) {
            System.out.println(color);
        }
    }

    public void task3(List<String> list, String addedWord) {
        list.add(0, addedWord);
        System.out.println("insert element" + addedWord + "into array: ");
        System.out.println(list);
    }

    public void task4(List<String> list, int index) {
        System.out.println("retrieve an element (at a specified index): ");
        System.out.println(list.get(index));
    }

    public void task5(List<String> list, int index, String word) {
        list.set(index, word);
        System.out.println("update specific array element " + word + " by given element");
        System.out.println(list);
    }

    public void task6(List<String> list) {
        list.remove(2);
        System.out.println("remove the third element from a array list: ");
        System.out.println(list);
    }

    public void task7(List<String> list, String searchThisWord) {
        System.out.println("search an element in a array list: ");
        for (String word : list) {
            if (word.equals(searchThisWord)) {
                System.out.println("I find this word, this is - " + word);
            }
        }
    }

    public void task8(List<String> list) {
        Collections.sort(list);
        System.out.println("sort a given array list: ");
        System.out.println(list);
    }

    public void task9(List<String> list1, List<String> list2) {
       Collections.copy(list1, list2);
        System.out.println("copy one array list into another: ");
        System.out.println(list1);
    }

    public void task10(List<String> list) {
        Collections.shuffle(list);
        System.out.println("shuffle elements in a array list: ");
        System.out.println(list);
    }

    public void task11(List<String> list) {
        Collections.reverse(list);
        System.out.println("reverse elements in a array list: ");
        System.out.println(list);
    }

    public void task12(List<String> list, int start, int end) {
        System.out.println("extract a portion of a array list: ");
        System.out.println(list.subList(start, end));
    }

    public void task13(List<String> list, List<String> list2) {
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println("compare two array lists: ");
        System.out.println(list.equals(list2));
    }

    public void task14(List<String> list, int first, int second) {
        String temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
        System.out.println("swap two elements in an array list: ");
        System.out.println(list);
    }

    public void task15(List<String> first, List<String> second) {
        List<String> result = new LinkedList<>(first);
        result.addAll(second);
        System.out.println("join two array lists: ");
        System.out.println(result);
    }

    public void task16(ArrayList<String> original) {
        ArrayList<String> cloned = new ArrayList<>(original);
        // or ArrayList<String> cloned2 = (ArrayList<String>) original.clone();
        System.out.println("clone an array list to another array list: ");
        System.out.println(cloned);
    }

    public void task17(List<String> list) {
        list.clear();
        System.out.println("empty an array list: ");
        System.out.println(list);
    }

    public void task18(List<String> list) {
        boolean isEmpty = list.isEmpty();
        System.out.println("test an array list is empty or not: ");
        System.out.println(isEmpty);
    }

    public void task19(ArrayList<String> list, int capacity) {
        list.trimToSize();
        System.out.println("trim the capacity of an array list the current list size: ");
        System.out.println(list);
    }

    public void task20(ArrayList<String> list, int newSize) {
        list.ensureCapacity(newSize);
        System.out.println("increase the size of an array list: ");
        System.out.println(list);
    }

    public void task21(List<String> list, String newWord) {
        list.set(1, newWord);
        System.out.println("replace the second element of a ArrayList with the specified element: ");
        System.out.println(list);
    }

    public void task22(List<String> list) {
        System.out.println("print all the elements of a ArrayList using the position of the elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
