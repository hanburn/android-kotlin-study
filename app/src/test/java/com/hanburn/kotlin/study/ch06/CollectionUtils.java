package com.hanburn.kotlin.study.ch06;

import java.util.List;

/**
 * Created by hanburn on 2017. 11. 20..
 */

public class CollectionUtils {
    public static List<String> uppercaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }
}
