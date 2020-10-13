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
        
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < 10; i++) {
//            sb.append(i).append(",");
//        }
//        System.out.println(sb.toString());
//        String sbStr = sb.toString().substring(0, sb.toString().length() -1);
//        System.out.println(sbStr);
        
        String tmpcond = "name like '%name1\n" +
                "name2\n" +
                "name3%' and code like '%code1\n" +
                " code2\n" +
                " code13%' and sp = '2'";

        if (tmpcond.indexOf("name like '") >= 0) {
            String[] split = tmpcond.split("name like '");
            String names = split[1].split("%'")[0];
            String tmpend = split[1].substring((split[1].indexOf("%'") + 2), split[1].length());
            String[] namelist = names.split("\n");
            tmpcond = split[0] + " (";
            for (int i = 0; i < namelist.length; i++) {
                if (i == namelist.length - 1) {
                    tmpcond += "  name like '" + namelist[i] + "%' ) ";
                } else {
                    tmpcond += "  name like '" + namelist[i] + "%' or  ";
                }
            }
            tmpcond += tmpend;
        }

        System.out.println(tmpcond);
    }
}
