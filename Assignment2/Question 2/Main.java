public class Main {

    public static void main(String[] args) {
	// write your code here

        BinarySearchTree tree = new BinarySearchTree();

        //insert the elements in the bst

        tree.insert(4);

        tree.insert(2);

        tree.insert(5);

        tree.insert(1);

        tree.insert(3);

        System.out.println("increasing order:");

        tree.printTree();

        System.out.println("PostOrder:");

        tree.postOrder();

        System.out.println("The sum: "+ tree.keySum());



        System.out.println("deletes the minimum element of the tree.");

        tree.deleteMin(tree.root);

        System.out.println("increasing order:");

        tree.printTree();



        System.out.println("find the element 10 in the tree: "+ tree.find(10));

        System.out.println("insert the element 10 in the tree. ");

        tree.insert(10);

        System.out.println("find the element 10 in the tree: "+ tree.find(10));

    }
}
