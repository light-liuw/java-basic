package cn.liuw.collections.list;

import cn.liuw.collections.object.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuw
 * @date 2020/10/28
 */
public class ListDeal {

    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Element element = new Element();
            element.setId(i);
            elements.add(element);
        }
        changeElementName(elements);
        System.out.println(elements);
    }
    
    private static void changeElementName(List<Element> elementList) {
        elementList.stream().forEach(e-> e.setName("1"));
    }
    
}
