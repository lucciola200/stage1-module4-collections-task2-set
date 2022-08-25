package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
//        elements that belong to the first and the second Sets at once and not belong to the third Set
        Set<String> set = new HashSet<>(firstSet);
        set.retainAll(secondSet);
        set.removeAll(thirdSet);

//        elements that belong only to the third Set.
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        set.addAll(thirdSet);

        return set;
    }
}
