package cn.liuw.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuw
 * @date 2020/9/22
 */
public class ListTestMain {
    
    public static void main(String[] args) {
        List<ListA> listAS = new ArrayList<>();
        List<ListB> listBS = new ArrayList<>();

        initListA(listAS);
        System.out.println(listAS.size());
        listAS.parallelStream().forEach( a -> {
            ListB b = new ListB();
            listBS.add(b);
        });
        
        System.out.println(listBS.size());
        
    }
    
    // 
    public static void initListA(List<ListA> listAS) {
        for (int i = 0; i < 200; i++) {
            ListA listA = new ListA();
            listA.setOld1("1");
            listA.setOld2("2");
            listA.setOld3("3");
            listAS.add(listA);
        }
    }
    
    
}
