package com.devix.www;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List stuff = Arrays.asList(new String[]{"a", "b", "c"});
        List stuff = Arrays.asList("a", "b", "c");
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);

        try {
            list.set(0, "new value");
        } catch (UnsupportedOperationException e) {

        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
        System.out.println("Collection is read-only now");
    }
}
