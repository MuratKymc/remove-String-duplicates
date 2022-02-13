package com.company;

import java.util.ArrayList;

public class removeDuplicates {

    public static ArrayList<String> removeDup(ArrayList<String> ar1) {

        ArrayList<String> newList = new ArrayList<>();

        for (String name : ar1) {
            if (!newList.contains(name)) {
                newList.add(name);
            }
        }
        return newList;
    }
}

