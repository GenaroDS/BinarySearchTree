public class Tree {
    Node root;

    Tree() {
        this.root = null;
    }

    void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }
        Node currentNode = root;
        Node parentNode = null;
        while (currentNode != null) {
            parentNode = currentNode;
            if (key < currentNode.key)
                currentNode = currentNode.left;
            else if (key > currentNode.key)
                currentNode = currentNode.right;
            else
                return;
        }
        if (key < parentNode.key)
            parentNode.left = newNode;
        else
            parentNode.right = newNode;
    }

    boolean search(int key) {
        Node currNode = root;
        while (currNode != null) {
            if (key == currNode.key)
                return true;
            else if (key < currNode.key)
                currNode = currNode.left;
            else
                currNode = currNode.right;
        }
        return false;
    }

    public void printTree(Node root, int space) {
        int count = 10;
        if (root == null)
            return;

        space += count;

        printTree(root.right, space);

        System.out.println();
        for (int i = count; i < space; i++) 
            System.out.print(" ");
        System.out.println(root.key);
        
        printTree(root.left, space);
    }

    public void printTree() {
        printTree(root, 0);
    }


}
