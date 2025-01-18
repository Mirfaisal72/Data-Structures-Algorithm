import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      //BinaryTree tree = new BinaryTree();
      //Scanner scanner = new Scanner(System.in);
      //BinaryTree.Node node  =  new BinaryTree.Node(10);
        //tree.populate(scanner);
       // BST Tree = new BST();
        //int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //Tree.populateSorted(arr);
        //Tree.display();
        Tree2Avl tree = new Tree2Avl();
        for(int i=0; i<1000;i++){
            tree.insert(i);
        }
        System.out.println("The height of the tree is: "+ tree.height());
    }

}
