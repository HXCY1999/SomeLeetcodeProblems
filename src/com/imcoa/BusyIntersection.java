package com.imcoa;

import java.util.*;

public class BusyIntersection {
    public static void main(String[] args) {
        List<Integer> arrival = new ArrayList<>();
        List<Integer> street = new ArrayList<>();
        arrival.add(0);
        arrival.add(0);
        arrival.add(1);
        arrival.add(4);
        street.add(0);
        street.add(1);
        street.add(1);
        street.add(0);

        Deque<int[]> mainStreet = new LinkedList<>();
        Deque<int[]> firstAvenue = new LinkedList<>();
        int[] res = new int[arrival.size()];
        int currTime = 0;


        for (int i = 0; i < arrival.size(); i++) {
            Integer arriveTime = arrival.get(i);
            Integer runStreet = street.get(i);
            if (runStreet == 0) {
                mainStreet.add(new int[]{i, arriveTime});
            }
            if (runStreet == 1) {
                firstAvenue.add(new int[]{i, arriveTime});
            }
        }
        for(int[] e: mainStreet){
            for (int n:e){
                System.out.print("n="+n);
            }
            System.out.println();
        }

        while (!mainStreet.isEmpty() || !firstAvenue.isEmpty()) {
            if (!mainStreet.isEmpty() && !firstAvenue.isEmpty()) {
                //car on main street arrive first
                if (mainStreet.getFirst()[1] < firstAvenue.getFirst()[1]) {
                    int[] passTime = mainStreet.pollFirst();
                    currTime = Math.max(currTime, passTime[1]);
                    res[passTime[0]] = currTime;
                    currTime++;
                    //let rest car on main go
                    while (!mainStreet.isEmpty() && mainStreet.getFirst()[1] <= currTime) {
                        passTime = mainStreet.pollFirst();
                        res[passTime[0]] = currTime;
                        currTime++;
                    }
                } else {
                    //car on firs avenue arrive first
                    int[] passTime = firstAvenue.pollFirst();
                    currTime = Math.max(currTime, passTime[1]);
                    res[passTime[0]] = currTime;
                    currTime++;
                    //let rest car on first avenue go
                    while (!firstAvenue.isEmpty() && firstAvenue.getFirst()[1] <= currTime) {
                        passTime = firstAvenue.pollFirst();
                        res[passTime[0]] = currTime;
                        currTime++;
                    }
                }
            }else if (!mainStreet.isEmpty()){
                while (!mainStreet.isEmpty()){
                   int[] passTime = mainStreet.pollFirst();
                   currTime = Math.max(currTime,passTime[1]);
                   res[passTime[0]] = currTime;
                   currTime++;
                }
            }else if (!firstAvenue.isEmpty()){
                while (!firstAvenue.isEmpty()){
                    int[] passTime = firstAvenue.pollFirst();
                    currTime = Math.max(currTime,passTime[1]);
                    res[passTime[0]] = currTime;
                    currTime++;
                }
            }
        }
        LinkedList<Integer> finalResult = new LinkedList<>();
        for (int n:res)
        System.out.println(n);
    }
}
