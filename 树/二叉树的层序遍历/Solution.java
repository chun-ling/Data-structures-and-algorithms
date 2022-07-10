package 二叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author YUChangcan
 * @date 2022/7/10 - 9:33
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {//广度优先
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>>resList = new ArrayList<>();
        Queue<TreeNode>tempQueue = new LinkedList<>();//一端入，一端出的“队”
        tempQueue.add(root);
        while(!tempQueue.isEmpty()){
            int len = tempQueue.size();//此时有多少TreeNode
            List<Integer>tempList = new ArrayList<>();//每次循环重新创建tempList
            for(int i = 0;i < len;i++) {
                TreeNode node = tempQueue.poll();//最先入队的最先出队
                tempList.add(node.val);
                if (node.left != null)//继续入队
                    tempQueue.add(node.left);
                if(node.right != null)
                    tempQueue.add(node.right);
            }
            resList.add(tempList);
        }
        return resList;
    }
}
