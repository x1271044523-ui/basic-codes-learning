package com.xjh.a01staticdemo1;

import java.sql.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class ArrUtil {
    private void ArrUitl() {
    }

    public static String printArr(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add((arr[i]) + "");
        }
        return sj.toString();
    }

    public static float getAverage(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
