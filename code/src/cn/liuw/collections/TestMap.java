package cn.liuw.collections;

import cn.liuw.collections.object.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuw
 * @date 2020/10/23
 */
public class TestMap {

    public static void main(String[] args) {
        
        List<Element> elementList = new ArrayList<>();
        
        for (int i = 0; i < 5 ; i++) {
            Element element = new Element();
            element.setId(i);
            element.setName("Jack" + i);
            elementList.add(element);
        }
        
        List<String>  stringList = elementList.stream().map(p -> p.getName()).collect(Collectors.toList());
        String[]  arr = elementList.stream().map(p -> p.getName()).toArray(String[]::new);
        for (String s : arr) {
            System.out.println(s);
        }
      
        System.out.println(stringList);


        System.out.println("===========================");
        Integer i = new Integer(0);
        System.out.println(i);
    }
}
