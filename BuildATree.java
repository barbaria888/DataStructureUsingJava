
class Tree {
    int data;

    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data, Node left,Node right) {
            this.data = data;
            this.left = left;
            this.right=right;
        }
        Node(int data)
        {
            this.data=data;
        }
    }
    static class BinaryTree {
            int idx=0;
        public Node CreateTree(int nums[]) {
            ++idx;
            if(nums[idx]==-1)
            {
                return null;
            }
            Node newnode=new Node(nums[idx]);
            newnode.left= CreateTree(nums);
            newnode.right=CreateTree(nums);
            System.out.println(newnode.data);
            return newnode;

        }
    }


    public static void main(String[] args) {
        int node[]={1,2,-1,-1,3,-1,-1};
        BinaryTree tr=new BinaryTree();

        Node root=new Node(1);
        Node t=root;
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        Node r=root;
        while(t!=null||r!=null)
        {
            System.out.println(t.data+" "+r.data);
            t=t.left;
            r=t.right;
        }
        //Node n =tr.CreateTree(node);
        //System.out.println(n.);

    }
}
