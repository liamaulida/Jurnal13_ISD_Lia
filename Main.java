public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();

        char[] nodes = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};
        for (char node : nodes) {
            tree.insertNode(node);
        }

        System.out.println("Inorder traversal of the constructed BST:");
        tree.inorderTraversal();
        System.out.println();

        System.out.println("Preorder traversal of the constructed BST:");
        tree.preorderTraversal();
        System.out.println();

        System.out.println("Postorder traversal of the constructed BST:");
        tree.postorderTraversal();
        System.out.println();

        char searchChar1 = 'K';
        char searchChar2 = 'A';

        System.out.println("Search for character " + searchChar1 + ":");
        tree.searchNode(searchChar1);

        System.out.println("Search for character " + searchChar2 + ":");
        tree.searchNode(searchChar2);
    }
}
