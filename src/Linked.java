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
        System.out.println(linkedList);

    }

    public void task1(List<String> list, String element) {
        list.add(element);
        System.out.println(list);
    }

    public void task2(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void task3(List<String> list, int indexStartIterator) {
        ListIterator<String> iterator = list.listIterator(indexStartIterator);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void task4(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public void task5(List<String> list, int index, String element) {
        list.set(index, element);
    }

    public void task6(LinkedList<String> list, String firstP, String lastP) {
        list.addFirst(firstP);
        list.addLast(lastP);
    }

    public void task7(LinkedList<String> list, String firstP) {
        list.offerFirst(firstP);
    }

    public void task8(LinkedList<String> list, String lastP) {
        list.offerLast(lastP);
    }

    public void task9(LinkedList<String> list, LinkedList<String> insert, int index) {
        list.addAll(index, insert);
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
    }

    public void task13(LinkedList<String> list) {
        list.removeFirst();
        list.removeLast();
    }

    public void task14(LinkedList<String> list) {
        list.clear();
    }

    public void task15(List<String> list, int indexI, int indexJ) {
        Collections.swap(list, indexI, indexJ);
    }

    public void task16(List<String> list) {
        Collections.shuffle(list);
    }

    public void task17(LinkedList<String> joined, LinkedList<String> list, LinkedList<String> list2) {
        joined.addAll(list);
        joined.addAll(list2);
    }

    public void task18(LinkedList<String> original, LinkedList<String> list2) {
        list2 = (LinkedList<String>) original.clone();
    }

    public void task19(LinkedList<String> list) {
        System.out.println(list.removeFirst());
    }

    public void task20(LinkedList<String> list) {
        System.out.println(list.peekFirst());
    }

    public void task21(LinkedList<String> list) {
        System.out.println(list.peekLast());
    }

    public void task22(LinkedList<String> list, String findMe) {
        System.out.println(list.contains(findMe));
    }

    public ArrayList<String> task23(LinkedList<String> list) {
        return new ArrayList<>(list);
    }

    public void task24(LinkedList<String> list, LinkedList<String> list2) {
        System.out.println(list.equals(list2));
    }

    public void task25(LinkedList<String> list) {
        System.out.println(list.isEmpty());
    }

    public void task26(LinkedList<String> list, String newElement, int index) {
        list.set(index, newElement);
    }
}
