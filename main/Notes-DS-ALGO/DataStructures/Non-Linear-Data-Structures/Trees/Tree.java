// structure of each node
class Node {
    int value;
    Node left;
    Node right;

    // node creation or initialization
    public Node(int v) {
        this.value = v;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree(int v) {
        root = new Node(v);
    }

    public BinaryTree() {
        root = null;
    }

    // inorder traversal: left -> root -> right
    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        display(root);
        inorder(root.right);
    }

    
    // preorder traversal: root -> left -> right
    void preorder(Node root) {
        if (root == null) {
            return;
        } 

        display(root);
        preorder(root.left);
        preorder(root.right);
    }

    // postorder traversal: left -> right -> root
    void postorder(Node root) {
        if (root == null) {
            return;
        } 

        preorder(root.left);
        preorder(root.right);
        display(root);
    }

    void display(Node root) {
        System.out.print(root.value + " ");
    }  

}

class Tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
    }
}
