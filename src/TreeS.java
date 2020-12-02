package HW;

import java.util.*;

public class TreeS {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("green");
        treeSet.add("red");
        treeSet.add("white");
        treeSet.add("black");

        System.out.println("new tree set: ");
        System.out.println(treeSet);

    }

    public void task2(TreeSet<String> set) {
        System.out.println("iterate through all elements in a tree set: ");
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void task3(Set<String> set1, Set<String> set2) {
        System.out.println("add all the elements of a specified tree set to another tree set: ");
        set1.addAll(set2);
        System.out.println(set1);
    }

    public void task4(TreeSet<String> set1) {
        System.out.println("reverse order view of the elements contained in a given tree set: ");
        Iterator<String> iter = set1.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void task5(TreeSet<String> set) {
        System.out.println("get the first and last elements in a tree set: ");
        System.out.println("first element - " + set.first() +
                System.lineSeparator() + "last element - " + set.last());
    }

    public void task6(TreeSet<String> set, TreeSet<String> setClone) {
        setClone = new TreeSet<>(set);
        System.out.println("clone a tree set list to another tree set: ");
        System.out.println(setClone);
    }

    public void task7(TreeSet<String> set) {
        int size = set.size();
        System.out.println("get the number of elements in a tree set: ");
        System.out.println("the number of elements in this a tree set - " + size);
    }

    public void task8(TreeSet<String> set, TreeSet<String> set1) {
        System.out.println("compare two tree sets: ");
        for (String s : set) {
            System.out.println(set1.contains(s) ? "equals" : "not equals");
        }
    }

    public void task9(TreeSet<Integer> set) {
        SortedSet<Integer> lessThan7 = set.headSet(7);
        System.out.println("find the numbers less than 7 in a tree set: ");
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
        System.out.println("retrieve and remove the first element of a tree set: ");
        System.out.println("element " + set.pollFirst() + " will be removed");
    }

    public void task15(TreeSet<Integer> set) {
        System.out.println("retrieve and remove the last element of a tree set: ");
        System.out.println("element " + set.last() + " will be removed");
    }

    public void task16(TreeSet<Integer> set, Integer e) {
        System.out.println("remove a given element from a tree se: ");
        System.out.println(set.remove(e));
    }
}
