public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    // constructor initializes an empty Tree
    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue); // create root node
        } else {
            root.insert(insertValue); // call the insert method
        }
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // output node data
        preorderHelper(node.getLeftNode()); // traverse left subtree
        preorderHelper(node.getRightNode()); // traverse right subtree
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode()); // traverse left subtree
        System.out.printf("%s ", node.getData()); // output node data
        inorderHelper(node.getRightNode()); // traverse right subtree
    }

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftNode()); // traverse left subtree
        postorderHelper(node.getRightNode()); // traverse right subtree
        System.out.printf("%s ", node.getData()); // output node data
    }

    // search for a node in the binary search tree and display its position
    public void searchNode(E key) {
        int position = searchNodeHelper(root, key, 0);
        if (position != -1)
            System.out.println("Data " + key + " ditemukan pada struktur node ke-" + position);
        else
            System.out.println("Data " + key + " tidak ditemukan");
    }

    // recursive method to search for a node and return its position
    private int searchNodeHelper(TreeNode<E> node, E key, int position) {
        if (node == null) {
            return -1;
        }
        if (key.equals(node.getData())) {
            return position;
        } else if (key.compareTo(node.getData()) < 0) {
            return searchNodeHelper(node.getLeftNode(), key, 2 * position + 1);
        } else {
            return searchNodeHelper(node.getRightNode(), key, 2 * position + 2);
        }
    }
}