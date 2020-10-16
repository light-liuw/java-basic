package cn.liuw.leet.common;

import java.util.Arrays;

/**
 * @author liuw
 * @date 2020/10/16
 */
public class Test1016 {

    public static void main(String[] args) {

        int[] a = {-7, -3, 2, 3, 11};

        for (int i : sortedSquares(a)) {
            System.out.println(i);   
        }
    }
    
    public static int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
    
}
