// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PrintNodesAtKDistance {
    public static void printNodesAtKDistance(TreeNode root, int k) {
        if (root == null || k < 0) {
            return;
        }

        printNodesAtKDistanceHelper(root, k, 0);
    }

    private static void printNodesAtKDistanceHelper(TreeNode node, int k, int distanceFromRoot) {
        if (node == null) {
            return;
        }

        if (distanceFromRoot == k) {
            System.out.print(node.val + " ");
        }

        printNodesAtKDistanceHelper(node.left, k, distanceFromRoot + 1);
        printNodesAtKDistanceHelper(node.right, k, distanceFromRoot + 1);
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int k = 2;
        System.out.println("Nodes at distance " + k + " from root:");
        printNodesAtKDistance(root, k);
    }
}
