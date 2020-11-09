package cn.liuw.leet.solution11;

/**
 * @author liuw
 * @date 2020/11/3
 */
public class Test1103 {

    public static void main(String[] args) {

        int[] A = {0,3,2,1};
        System.out.println(validMountainArray(A));
    }

    public static boolean validMountainArray(int[] A) {
        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            if(A.length < 2) {
                return false;
            }
            if (i == j || (i - j == -1) && (A[i] > A[j])) {
                return true;
            }
            if (A[i] >= A[i + 1]  || A[j - 1] <= A[j]) {
                return false;
            }
        }
        return false;
    }
}
