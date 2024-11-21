package main.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
    public static void main(String[] args) {
        Integer[] list1 = new Integer[]{1,2,3, 3, 4, 5};
        Integer[] list2 = new Integer[]{0, 4,5};

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static List<Integer> mergeTwoLists(Integer[] list1, Integer[] list2) {
      List<Integer> list3 = new ArrayList<>();
      list3.addAll(List.of(list1));
      list3.addAll(List.of(list2));
      return list3;
    }
}
