/**
 * Created by yuliav on 22/10/2019.
 */
public class Tree {
    Node root = null;

    // addR добавляет новый Node(newData) в поддерево с корнем currRoot
    // возвращает currRoot корень измененного поддерева
    private Node addR(Node currRoot, int newData) {
        if (currRoot == null) {
            currRoot = new Node(newData);
            return currRoot;
        }
        if (newData <= currRoot.data) {
            currRoot.left = addR(currRoot.left, newData);
        } else {
            currRoot.right = addR(currRoot.right, newData);
        }
        return currRoot;
    }

    public void add(int newData){
        root = addR(root, newData);
    }

}
