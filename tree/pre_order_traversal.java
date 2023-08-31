package tree;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreePreorderTraversal {
    // Function to perform preorder traversal
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes in the binary tree: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.println("Enter the values of the nodes:");
        TreeNode root = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (root == null) {
                root = new TreeNode(val);
            } else {
                insertNode(root, val);
            }
        }

        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);
    }

    // Function to insert a node in the binary tree
    public static void insertNode(TreeNode root, int val) {
        if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                insertNode(root.left, val);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                insertNode(root.right, val);
            }
        }
    }
}
