package cn.liuw.collections.object;

/**
 * @author liuw
 * @date 2020/11/10
 */
public class TreeResult {
    
    private  Integer id;
    private  String name;
    private  TreeResult children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeResult getChildren() {
        return children;
    }

    public void setChildren(TreeResult children) {
        this.children = children;
    }
}
