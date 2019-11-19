/**
 * Created by yuliav on 22/10/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        Tree myTree = new Tree();
//        myTree.delete(myTree.root, 123);
//        myTree.print();

        myTree.add(200);
        myTree.delete(myTree.root, 200); //TODO: update root?
        myTree.print();


        myTree.add(150);
        myTree.add(350);
        myTree.add(120);
        myTree.add(170);
        myTree.add(90);
        myTree.add(130);
        myTree.add(300);
        myTree.add(400);
        myTree.add(320);

        myTree.print();
        //System.out.println(myTree);

        myTree.delete(myTree.root, 90);
        System.out.println("new tree: ");
        myTree.print();
        System.out.println("Value of found element: ");
        System.out.println(myTree.findNode(myTree.root, 400).data);
    }
}
