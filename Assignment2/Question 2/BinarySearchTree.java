import java.util.ArrayList;
import java.util.List;





public class BinarySearchTree {
    //declare an instance variable

    public BinarySearchTreeNode root;

    // definition of the insert

    public void insert(int key) {

        //calls the insertHelper()

        root = insertHelper(root, key);

    }

    // definition of the insertHelper()

    private BinarySearchTreeNode insertHelper(BinarySearchTreeNode node, int key) {

        int value = 0;

        //if the node is null return the key

        if (node == null)

            return new BinarySearchTreeNode(key);

        //key value is greater than node's key value

        if (key > node.key)

            //then increment the value

            value = +1;

        else

            //if key value is less than node's key value

            if (key < node.key)

                //assign value as -1

                value = -1;






        if (value < 0)

            node.left = insertHelper(node.left, key);

            //if the value is grater than 0

        else if (value > 0)

            node.right = insertHelper(node.right, key);

        else

            node.key = key;

        return node;

    }




    public boolean find(int key) {

        //calls the findHelper()

        return findHelper(root, key);

    }

    // definition of the findHelper

    public boolean findHelper(BinarySearchTreeNode node, int key) {

        //iterates over the tree


        while (node != null) {

            if (key == node.key)

                return true;

            else if (key < node.key)

                node = node.left;

            else

                node = node.right;

        }

        return false;

    }

    // definition of the find ()

    private BinarySearchTreeNode min(BinarySearchTreeNode n) {

        if (n.left == null)

            return n;

        return min(n.left);

    }


    //this method returns the sum of all the keys in the tree


    public int keySum() {

        //create an ArrayList of Integer type

        List<Integer> keyList = new ArrayList<>();

        int sum = 0;

        //call the helper method keySumHelper(BinarySearchTreeNode,List)

        keySumHelper(root, keyList);

        for (int i : keyList) {

            sum += i;

        }

        //returns the sum

        return sum;

    }



    public void keySumHelper(BinarySearchTreeNode node, List<Integer> keyList) {



        if (node != null) {

            //call the method keySumHelper() recursively with left of the tree

            keySumHelper(node.left, keyList);

            //call the method keySumHelper() recursively with right of the tree

            keySumHelper(node.right, keyList);

            //add the key value of the node to the keyList

            keyList.add(node.key);

        }

    }


    //it delete the minimum element in the tree

    public BinarySearchTreeNode deleteMin(BinarySearchTreeNode node) {

        //if the left of the node is null the return the right of the node

        if (node.left == null)

            return node.right;

        //with the the left of the node

        node.left = deleteMin(node.left);

        return node;

    }

    //to print the elements of the tree

    public void printTree() {

        printTreeHelper(root);

    }

    //this method prints the elements in the tree in increasing order

    private void printTreeHelper(BinarySearchTreeNode node) {

        //if the left of the node is not null

        if (node.left != null) {

            //call the method printTreeHelper() recursively with left of the node

            printTreeHelper(node.left);

        }

        //print key value

        System.out.print(node.key + " ");

        //if the right of the node is not null

        if (node.right != null) {

            //call the method printTreeHelper() recursively with right of the node

            printTreeHelper(node.right);

        }

    }

    //to print the postorder of the tree

    public void postOrder() {

        postOrderHelper(root);


    }

    //this method prints the elements in the postorder of the tree

    private void postOrderHelper(BinarySearchTreeNode node) {

        //if the left of the node is not null

        if (node.left != null) {

            //call the method postOrderHelper() recursively with left of the node

            postOrderHelper(node.left);

        }

        //if the right of the node is not null

        if (node.right != null) {

            //call the method postOrderHelper() recursively with left of the node

            postOrderHelper(node.right);

        }

        //print key value of the node

        System.out.print(node.key + " ");
    }

}
