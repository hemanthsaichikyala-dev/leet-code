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
    
    
    public static void helper(TreeNode root,int level,List<List<Integer>> l1){
        if(root==null)
        return;

        if(level==l1.size())
        l1.add(new ArrayList<>());

        l1.get(level).add(root.val);

      helper(root.left,level+1,l1);
      helper(root.right,level+1,l1);


    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1 = new ArrayList<>();

        helper(root,0,l1);

        return l1;
        
    }
}