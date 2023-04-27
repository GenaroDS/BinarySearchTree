public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("");
        System.out.println("We add the numbers: 4, 2, 6, 0, 8.");
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(0);
        tree.insert(8);
        tree.printTree();
        System.out.println("");
        System.out.println("And then we add 7, 9, 1, 3.");
        tree.insert(7);
        tree.insert(9);
        tree.insert(1);
        tree.insert(3);
        tree.printTree();
        System.out.println("");
        System.out.println("The values are properly added to the tree.");
        System.out.println("");
    }
}



