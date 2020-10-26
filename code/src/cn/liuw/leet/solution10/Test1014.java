package cn.liuw.leet.solution10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuw
 * @date 2020/10/14
 */
public class Test1014 {

    public static void main(String[] args) {
        
        String[] A = {"cool","lock","cook"};
        
        System.out.println(commonChars(A));
        
    }

    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList();
        for(int i = 0; i< A[0].length(); i++) {
            String r = String.valueOf(A[0].charAt(i));
            boolean rb = true;
            for(int j = 1; j < A.length; j++) {
                if(A[j].indexOf(r) < 0) {
                    rb = false;
                    break;
                }
            }
            if(rb) {
                for(int j = 1; j < A.length; j++) {
                    A[j].replaceFirst(r, "1");
                }
                result.add(r);
            }
        }
        return result;
    }
}
