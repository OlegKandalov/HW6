package HW;

import java.util.*;

public class HashS {
    public static void main(String[] args) {

    }

    public void task1(Set<String> hash, String element) {
        hash.add(element);
    }

    public void task2(Set<String> hash) {
        Iterator<String> iterat = hash.iterator();
        while (iterat.hasNext()) {
            System.out.println(iterat.next());
        }
    }

    public int task3(Set<String> hash) {
        return hash.size();
    }

    public void task4(Set<String> hash) {
        hash.clear();
    }

    public void task5(Set<String> hash) {
        System.out.println(hash.isEmpty());
    }

    public void task6(HashSet<String> hash, HashSet<String> original) {
        hash = new HashSet<>(original);
        System.out.println(hash);
    }

    public String[] task7(Set<String> hash) {
        String[] array = new String[hash.size()];
        hash.toArray(array);
        return array;
    }

    public Set<String> task8(Set<String> hash) {
        Set<String> treeSet = new TreeSet<>(hash);
        return treeSet;
    }

    public List<String> task9(Set<String> hash) {
        List<String> arrayList = new ArrayList<>(hash);
        return arrayList;
    }

    public void task10(Set<String> hash1, Set<String> hash2) {
        for (String s : hash1) {
            if (hash2.contains(s)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public void task11(Set<String> hash1, Set<String> hash2) {
        hash1.retainAll(hash2);
    }

    public void task12(Set<String> hash1) {
        hash1.clear();
    }
}
