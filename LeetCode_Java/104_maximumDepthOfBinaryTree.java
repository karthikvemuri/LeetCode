class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class MaximumDepthOfBinaryTree{
    public int maximumDepthOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maximumDepthOfBinaryTree(root.left), maximumDepthOfBinaryTree(root.right));
    }

    public static void main(String[] args){
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        root.right.right.left.right = new TreeNode(10);

        System.out.println(solution.maximumDepthOfBinaryTree(root));


    }
}