package 验证二叉搜索树;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 15:45
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }
    public boolean isValidBST(TreeNode root,TreeNode min,TreeNode max){
        if(root == null)
            return true;
        if(min != null && root.val <= min.val)
            return false;
        if(max != null && root.val >= max.val)
            return false;
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
}
