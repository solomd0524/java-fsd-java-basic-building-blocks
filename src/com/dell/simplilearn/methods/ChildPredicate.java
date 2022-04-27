package com.dell.simplilearn.methods;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChildPredicate {
    static Predicate<Child> filterByAge(int x) {
        return a -> a.getAge() > x;
    }

    static List<Child> filterChilds(List<Child> childList, Predicate<Child> predicate) {
        return childList.stream().filter(predicate).collect(Collectors.<Child>toList());
    }

}
