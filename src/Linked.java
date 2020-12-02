package HW;

import java.util.*;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Linked bot = new Linked();
        linkedList.add("Red");
        linkedList.add("Orange");
        linkedList.add("Black");
        linkedList.add("Blue");
        linkedList.add("White");
        System.out.println("new list with added elements ");
        System.out.println(linkedList);

    }

    public void task1(List<String> list, String element) {
        list.add(element);
        System.out.println(list);
    }

    public void task2(List<String> list) {
        System.out.println("iterate through all elements in a linked list: ");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void task3(List<String> list, int indexStartIterator) {
        System.out.println("iterate through all elements in a linked list starting at the specified position: ");
        ListIterator<String> iterator = list.listIterator(indexStartIterator);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void task4(List<String> list) {
        System.out.println("iterate a linked list in reverse order: ");
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public void task5(List<String> list, int index, String element) {
        System.out.println("insert the specified element at the specified position in the linked list: ");
        list.set(index, element);
    }

    public void task6(LinkedList<String> list, String firstP, String lastP) {
        System.out.println("insert elements into the linked list at the first and last position: ");
        list.addFirst(firstP);
        list.addLast(lastP);
        System.out.println(list);
    }

    public void task7(LinkedList<String> list, String firstP) {
        System.out.println("insert the specified element at the front of a linked list: ");
        list.offerFirst(firstP);
        System.out.println(list);
    }

    public void task8(LinkedList<String> list, String lastP) {
        System.out.println("insert the specified element at the end of a linked list: ");
        list.offerLast(lastP);
        System.out.println(list);
    }

    public void task9(LinkedList<String> list, LinkedList<String> insert, int index) {
        System.out.println("insert some elements at the specified position into a linked list: ");
        list.addAll(index, insert);
        System.out.println(list);
    }

    public void task10(LinkedList<String> list) {
        System.out.println("first occurrence - " + list.getFirst() +
                System.lineSeparator() + "last occurrence - " + list.getLast());
    }

    public void task11(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element - " + list.get(i) + " : in position - " + i);
        }
    }

    public void task12(LinkedList<String> list, int removeThisElement) {
        list.remove(removeThisElement);
        System.out.println("remove a specified element from a linked list: ");
        System.out.println(list);
    }

    public void task13(LinkedList<String> list) {
        list.removeFirst();
        list.removeLast();
        System.out.println("remove first and last element from a linked list: ");
        System.out.println(list);
    }

    public void task14(LinkedList<String> list) {
        list.clear();
        System.out.println("emove all the elements from a linked list: ");
        System.out.println(list);
    }

    public void task15(List<String> list, int indexI, int indexJ) {
        Collections.swap(list, indexI, indexJ);
        System.out.println("swap two elements in an linked list: ");
        System.out.println(list);
    }

    public void task16(List<String> list) {
        Collections.shuffle(list);
        System.out.println("shuffle the elements in a linked list: ");
        System.out.println(list);
    }

    public void task17(LinkedList<String> joined, LinkedList<String> list, LinkedList<String> list2) {
        joined.addAll(list);
        joined.addAll(list2);
        System.out.println("join two linked lists: ");
        System.out.println(list +
                System.lineSeparator() + list2);
        System.out.println(joined);
    }

    public void task18(LinkedList<String> original, LinkedList<String> list2) {
        list2 = (LinkedList<String>) original.clone();
        System.out.println("clone an linked list to another linked list: ");
        System.out.println("original - " + original);
        System.out.println(list2);
    }

    public void task19(LinkedList<String> list) {
        System.out.println("remove and return the first element of a linked list: ");
        System.out.println(list.removeFirst());
    }

    public void task20(LinkedList<String> list) {
        System.out.println("retrieve but does not remove, the first element of a linked list: ");
        System.out.println(list.peekFirst());
    }

    public void task21(LinkedList<String> list) {
        System.out.println("retrieve but does not remove, the last element of a linked list: ");
        System.out.println(list.peekLast());
    }

    public void task22(LinkedList<String> list, String findMe) {
        System.out.println("check if a particular element exists in a linked list: ");
        System.out.println(list.contains(findMe));
    }

    public ArrayList<String> task23(LinkedList<String> list) {
        System.out.println("convert a linked list to array list: ");
        return new ArrayList<>(list);
    }

    public void task24(LinkedList<String> list, LinkedList<String> list2) {
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println("compare two linked lists: ");
        System.out.println(list.equals(list2));
    }

    public void task25(LinkedList<String> list) {
        System.out.println("test an linked list is empty or not: ");
        System.out.println(list.isEmpty());
    }

    public void task26(LinkedList<String> list, String newElement, int index) {
        list.set(index, newElement);
        System.out.println("replace an element in a linked list: ");
        System.out.println(list);
    }
}
