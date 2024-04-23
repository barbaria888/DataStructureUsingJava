import java.util.*;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
          this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }



public static void method(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if(root==null)return ;
    Queue<TreeNode> q = new LinkedList();
    TreeNode temp;
    q.add(root);
    while(!q.isEmpty())
    {   temp=q.poll();
        List <Integer> small = new ArrayList<>();
        int n =q.size();
         while(n!=0){
            temp =q.poll();
            small.add((temp.val));
             if(temp.left!=null)
             {q.add(temp.left);}
             if(temp.right!=null)
             {q.add(temp.right);}}
             list.add((small));
         }
    //}return  list;

}
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ll = new ArrayList<>();
        if(root == null)return ll;
        Queue<TreeNode>q = new LinkedList<>();
        TreeNode temp;
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer>l = new ArrayList<>();
            int n = q.size();
            while(n!=0){
                temp = q.poll();
                l.add(temp.val);
                if(temp.left != null)q.add(temp.left);
                if(temp.right != null)q.add(temp.right);
                n=n-1;
            }
            ll.add(l);
        }
        return ll;
    }
}
