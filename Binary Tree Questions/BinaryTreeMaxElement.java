class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeMaxElement {
    public int findMax(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("The binary tree is empty.");
        }

        return findMaxElement(root);
    }

    private int findMaxElement(TreeNode node) {
        int max = node.val;

        if (node.left != null) {
            max = Math.max(max, findMaxElement(node.left));
        }

        if (node.right != null) {
            max = Math.max(max, findMaxElement(node.right));
        }

        return max;
    }

    // Helper method to build a sample binary tree for testing
    private static TreeNode buildSampleTree() {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = buildSampleTree();
        BinaryTreeMaxElement binaryTreeMaxElement = new BinaryTreeMaxElement();

        int maxElement = binaryTreeMaxElement.findMax(root);
        System.out.println("The maximum element in the binary tree is: " + maxElement);
    }
}
