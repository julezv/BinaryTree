/**
 * Created by yuliav on 22/10/2019.
 */
public  class Tree {
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


    public void traverse (Node currRoot){
        if (currRoot.left != null){
            traverse (currRoot.left);
        }
        System.out.println(currRoot.data);
        if (currRoot.right != null){
            traverse (currRoot.right);
        }
    }

    public Node findMin(Node currRoot){
        while(currRoot.left != null ){
            currRoot = currRoot.left;
        }
        return currRoot;
    }

    // to delete:
     // case 1: no child
    // case 2: 1 child
    // case 3 2 children

    // 1.remove the reference of the node , cut link
    // 2. reclaim the memory allocated to the node being deleted

    // what if we want to delete a non leaf node ?
    // need to make sure that all other children of the deleted node remain in the tree

    //  case 2: if has only one child -> link its parent to its only child

    // case3: look for the min in right subtree of this node and fill in that value instead of deleted
    // and delete the emerging node with one child
    // - find min in right sub tree
    // - copy the value in targetted node
    // - delete duplicate from right subtree

    public Node delete (Node currRoot, int data) {
        if (currRoot == null) {
            return null;
        } else if (data < currRoot.data) {
           currRoot.left =  delete(currRoot.left, data);
        } else if (data > currRoot.data) {
            currRoot.right =  delete(currRoot.right, data);
        } else {
            // case 1, 2:
            if(currRoot.left == null){
                currRoot = currRoot.right;
            }
            else if(currRoot.right == null){
                currRoot = currRoot.left;
            }
            // case 3:
            else{
                currRoot = findMin(currRoot.right);

                currRoot.right = delete(currRoot.right, currRoot.data);
            }
        }
        return currRoot;
    }
}
