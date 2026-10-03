/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        return inorder(root,ans);
    }
    private List<Integer> inorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return ans;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        return ans;
    }
}