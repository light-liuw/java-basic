package cn.liuw.collections;

import cn.liuw.collections.object.TreeElement;
import cn.liuw.collections.object.TreeResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuw
 * @date 2020/11/10
 */
public class Tree {

    public static void main(String[] args) {
//        List<TreeElement> treeElements = new ArrayList<>();
//        treeElements.add(new TreeElement(1, "Name", 0));
//        treeElements.add(new TreeElement(2, "Jack", 1));
//        treeElements.add(new TreeElement(3, "Jerry", 1));
//        treeElements.add(new TreeElement(4, "Tom", 1));
//        treeElements.add(new TreeElement(5, "Age", 0));
//        treeElements.add(new TreeElement(6, "12", 5));
//        treeElements.add(new TreeElement(7, "16", 5));
//        treeElements.add(new TreeElement(8, "84", 5));
//
//        // 每次保存的数据量
//        int amount = 3;
//        // 份数
//        int part = treeElements.size() / amount;
//        // 余数
//        int remainder = treeElements.size() % amount;
//        List<TreeElement> treeElements1 = null;
//        List<TreeElement> treeElements2 = null;
//        // 处理数据集
//        for (int i = 0; i < part + 1; i++) {
//            if (i == part) {
//                // 处理余数部分
//                System.out.println("余数.." + i);
//                // treeElements1 = treeElements.subList(part * amount, treeElements.size());
//                printList(treeElements.subList(part * amount, treeElements.size()));
//            } else {
//                // 处理份数部分
//                System.out.println("份数.." + i);
//                // treeElements2 = treeElements.subList(i * amount, (i + 1) * amount);
//                printList(treeElements.subList(i * amount, (i + 1) * amount));
//            }
//        }
//
//
//        // 递归数
        
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(1);
      stringBuilder.append(2);
      stringBuilder.append(3);
      stringBuilder.append(4);
        System.out.println(stringBuilder.toString());
    }

    /**
     * 打印集合
     */
    private static void printList(List<TreeElement> treeElementList) {
        treeElementList.forEach(e-> System.out.println(e.toString()));
    }
    
    /**
     * 通过递归的方式获取树数据
     */
    private static List<TreeResult> getTreeResultByRecursive(List<TreeResult> treeResultList, List<TreeElement> treeElementList, Integer parentId) {
        List<TreeResult> treeResults = new ArrayList<>();
        if (parentId != null) {
            // treeElementList.stream().filter( e -> e.getParentId() == parentId).map()
        }
        return treeResults;
    }
}
