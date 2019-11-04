/**
 * Created by yuliav on 22/10/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.add(200);
        myTree.add(150);
        myTree.add(350);
        myTree.add(120);
        myTree.add(170);
        myTree.add(90);
        myTree.add(130);
        myTree.add(300);
        myTree.add(400);
        myTree.add(320);

        myTree.traverse(myTree.root);
        myTree.delete(myTree.root, 90);
        System.out.println("new tree: ");
        myTree.traverse(myTree.root);
        System.out.println("Value of founf element: ");
        System.out.println(myTree.findNode(myTree.root, 400).data);
    }
}
