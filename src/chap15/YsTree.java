package chap15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class YsTree<T> implements Iterable<YsTree<T>> {
    private T data;
    private YsTree<T> parent;
    private List<YsTree<T>> children;

    public YsTree(T data) {
        this.data = data;
        this.children = new LinkedList<YsTree<T>>();
    }

    public YsTree<T> addChild(T child) {
        YsTree<T> childNode = new YsTree<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }

    @Override
    public Iterator<YsTree<T>> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        YsTree<String> root = new YsTree<String>("root");
        {
            YsTree<String> node1 = root.addChild("node1");
            YsTree<String> node2 = root.addChild("node2");
            YsTree<String> node3 = root.addChild("node3");
            {
                YsTree<String> node4 = node1.addChild("node4");
                YsTree<String> node5 = node1.addChild("node5");
                {
                    YsTree<String> node6 = node3.addChild("node6");
                }
            }
        }
    }
}



