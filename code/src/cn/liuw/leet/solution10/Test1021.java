package cn.liuw.leet.solution10;

/**
 * 925. 长按键入
 * <p>
 * <p>
 * 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * <p>
 * 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
 * <p>
 * 示例 1
 * 输入：name = "alex", typed = "aaleex"
 * 输出：true
 * 解释：'alex' 中的 'a' 和 'e' 被长按。
 * <p>
 * 示例 2：
 * 输入：name = "saeed", typed = "ssaaedd"
 * 输出：false
 * 解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样
 *
 * @author liuw
 * @date 2020/10/22
 */
public class Test1021 {

    public static void main(String[] args) {
        System.out.println(isLongPressedNameV2("", "aaleex"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < name.length(); ) {
            if (name.charAt(i) == typed.charAt(j)) {
                if (i == name.length() - 1) {
                    for (int k = j; k < typed.length(); k++) {
                        if (name.charAt(i) != typed.charAt(k)) {
                            return false;
                        }
                    }
                    return true;
                }
                j++;
                i++;
            } else if (i == 0) {
                return false;
            } else if (name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }

            if (j > typed.length() - 1) {
                return false;
            }
        }
        return true;
    }


    public static boolean isLongPressedNameV2(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if(i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0  && typed.charAt(j) == typed.charAt(j-1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
