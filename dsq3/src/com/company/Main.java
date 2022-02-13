package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("murat");
        nameList.add("sadık");
        nameList.add("murat");
        nameList.add("sevcan");
        nameList.add("osman");
        nameList.add("ayşe");
        nameList.add("sevcan");
        nameList.add("murat");

        System.out.println(nameList);

        nameList = removeDuplicates.removeDup(nameList);
        System.out.println(nameList);

    }
}
