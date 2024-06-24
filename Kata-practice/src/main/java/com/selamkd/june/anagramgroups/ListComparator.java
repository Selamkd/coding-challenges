package com.selamkd.june.anagramgroups;

import java.util.Comparator;
import java.util.List;

public class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

    @Override
    public int compare(List<T> list1, List<T> list2) {
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            int compare = list1.get(i).compareTo(list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(list1.size(), list2.size());
    }
}


