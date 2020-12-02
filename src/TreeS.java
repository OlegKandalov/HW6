package HW;

import java.util.*;

public class TreeS {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("green");
        treeSet.add("red");
        treeSet.add("white");
        treeSet.add("black");

        System.out.println(treeSet);

    }

    public void task2(TreeSet<String> set) {
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void task3(Set<String> set1, Set<String> set2) {
        set1.addAll(set2);
    }

    public void task4(TreeSet<String> set1) {
        Iterator<String> iter = set1.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void task5(TreeSet<String> set) {
        System.out.println("first element - " + set.first() +
                System.lineSeparator() + "last element - " + set.last());
    }

    public void task6(TreeSet<String> set, TreeSet<String> setClone) {
        setClone = new TreeSet<>(set);
        System.out.println(setClone);
    }

    public void task7(TreeSet<String> set) {
        int size = set.size();
        System.out.println("the number of elements in this a tree set - " + size);
    }

    public void task8(TreeSet<String> set, TreeSet<String> set1) {
        for (String s : set) {
            System.out.println(set1.contains(s) ? "equals" : "not equals");
        }
    }

    public void task9(TreeSet<Integer> set) {
        SortedSet<Integer> lessThan7 = set.headSet(7);
        System.out.println(lessThan7);
    }

    public void task10(TreeSet<Integer> set, Integer e) {
        System.out.println("element is greater than or equal to the given element " + set.ceiling(e));
    }

    public void task11(TreeSet<Integer> set, Integer e) {
        System.out.println("element is less than or equal to the given element " + set.floor(e));
    }

    public void task12(TreeSet<Integer> set, Integer e) {
        System.out.println("element is strictly greater than or equal to the given element " + set.higher(e));
    }

    public void task13(TreeSet<Integer> set, Integer e) {
        System.out.println("element is strictly less than the given element " + set.lower(e));
    }

    public void task14(TreeSet<Integer> set) {
        System.out.println("element " + set.pollFirst() + " will be removed");
    }

    public void task15(TreeSet<Integer> set) {
        System.out.println("element " + set.last() + " will be removed");
    }

    public void task16(TreeSet<Integer> set, Integer e) {
        System.out.println(set.remove(e));
    }
}
