package 二叉树的最大深度;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 15:01
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
