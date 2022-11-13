package com.imcoa;

import java.util.*;

public class Busy {
    public static void main(String[] args) {
        List<Integer> arrival = new ArrayList<>();
        List<Integer> street = new ArrayList<>();
        arrival.add(0);
        arrival.add(1);
        arrival.add(1);
        arrival.add(3);
        arrival.add(3);
        street.add(0);
        street.add(1);
        street.add(0);
        street.add(0);
        street.add(1);
        int n = 10;

        PriorityQueue<int[]> time_car=new PriorityQueue<>();
        Deque<int[]> first_avenue=new ArrayDeque<>();
        int[] ans=new int[n];

        ArrayList<ArrayList> arrayLists = new ArrayList<>();
        System.out.println(arrayLists);
        arrayLists.add(new ArrayList());
        System.out.println(arrayLists);

    }
}
