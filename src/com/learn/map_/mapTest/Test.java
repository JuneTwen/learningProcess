package com.learn.map_.mapTest;

import java.util.*;

@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","calista");
        map.put("no2","jack");
        map.put("no3","tom");
        map.put("no4","john");
        map.put("no5","peter");
        map.put("no6","lucy");

        // #1 取出所有 key
        Set keySet = map.keySet();
        // ##1
        for (Object o : keySet) {
            System.out.println(o + "-" + map.get(o));
        }
        // ##2
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next + "-" + map.get(next));
        }
//        // #2 取出所有 value
//        Collection values = map.values();
//        // ##1
//        for (Object o : values) {
//            System.out.println(o);
//        }
//        // ##2
//        Iterator iterator = values.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }
//        // #1 通过 entrySet 获取
//        Set entrySet = map.entrySet();
//        // ##1
//        for (Object o : entrySet) {
//            Map.Entry m = (Map.Entry) o;
//            System.out.println(m.getKey() + "-" + m.getValue());
//        }
//        // ##2
//        Iterator iterator = entrySet.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(((Map.Entry)next).getKey()
//                    + "-"
//                    +((Map.Entry)next).getValue());
//        }

//        map.remove("no1");
//        System.out.println(map.get("no2"));
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        map.clear();
//        System.out.println(map.containsKey("no2"));

    }
}
