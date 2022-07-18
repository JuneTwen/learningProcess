package com.learn.algorithm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class mySolution {
    public static int[][] merge(int[][] intervals){
        if (intervals.length == 0) return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        int[] temp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (temp[1] >= intervals[i][0]){
                temp[1] = Math.max(temp[1], intervals[i][1]);
            }else {
                list.add(temp);
                temp = intervals[i];
            }
        }
        list.add(temp);
        return list.toArray(new int[list.size()][2]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        mySolution.merge(intervals);
    }
}
