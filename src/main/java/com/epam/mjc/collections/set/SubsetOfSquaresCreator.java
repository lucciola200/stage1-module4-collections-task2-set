package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int x : sourceList) {
            treeSet.add(x * x);
        }

        for (int x : treeSet) {
            if (x >= lowerBound && x <= upperBound) {
                set.add(x);
            }
        }

        return set;
    }
}
