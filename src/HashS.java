package HW;

import java.util.*;

public class HashS {
    public static void main(String[] args) {

    }

    public void task1(Set<String> hash, String element) {
        System.out.println("append the specified element to the end of a hash set: ");
        hash.add(element);
    }

    public void task2(Set<String> hash) {
        System.out.println("iterate through all elements in a hash list: ");
        Iterator<String> iterat = hash.iterator();
        while (iterat.hasNext()) {
            System.out.println(iterat.next());
        }
    }

    public int task3(Set<String> hash) {
        System.out.println("get the number of elements in a hash set: ");
        return hash.size();
    }

    public void task4(Set<String> hash) {
        hash.clear();
        System.out.println("empty an hash set: ");
        System.out.println(hash);
    }

    public void task5(Set<String> hash) {
        System.out.println("test a hash set is empty or not: ");
        System.out.println(hash.isEmpty());
    }

    public void task6(HashSet<String> hash, HashSet<String> original) {
        hash = new HashSet<>(original);
        System.out.println("clone a hash set to another hash set: ");
        System.out.println(hash);
    }

    public String[] task7(Set<String> hash) {
        System.out.println("convert a hash set to an array");
        String[] array = new String[hash.size()];
        hash.toArray(array);
        return array;
    }

    public Set<String> task8(Set<String> hash) {
        System.out.println("convert a hash set to a tree set");
        Set<String> treeSet = new TreeSet<>(hash);
        return treeSet;
    }

    public List<String> task9(Set<String> hash) {
        System.out.println("convert a hash set to a List/ArrayList");
        List<String> arrayList = new ArrayList<>(hash);
        return arrayList;
    }

    public void task10(Set<String> hash1, Set<String> hash2) {
        System.out.println("compare two hash set: ");
        for (String s : hash1) {
            if (hash2.contains(s)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public void task11(Set<String> hash1, Set<String> hash2) {
        System.out.println("compare two sets and retain elements which are same on both sets: ");
        System.out.println(hash1);
        System.out.println(hash2);
        hash1.retainAll(hash2);
        System.out.println(hash1);

    }

    public void task12(Set<String> hash1) {
        System.out.println(hash1);
        hash1.clear();
        System.out.println("remove all of the elements from a hash set: ");
        System.out.println(hash1);
    }
}
