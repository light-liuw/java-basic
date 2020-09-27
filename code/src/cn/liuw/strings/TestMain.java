package cn.liuw.strings;

/**
 * @author liuw
 * @date 2020/9/18
 */
public class TestMain {

    public static void main(String[] args) {
//        String a = "";
//        String b = null;
//        String c = "1";
//        
//        if(a.isEmpty()) {
//            System.out.println("a");
//        }
//
////        if(b.isEmpty()) {
////            System.out.println("b");
////        }
//
//        if(c.isEmpty()) {
//            System.out.println("c");
//        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(i).append(",");
        }
        System.out.println(sb.toString());
        String sbStr = sb.toString().substring(0, sb.toString().length() -1);
        System.out.println(sbStr);
    }
}
