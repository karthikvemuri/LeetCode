from typing import Optional


class TreeNode:
    def __init__(self, val = 0, left = None, right = None):
        self.val = val
        self.left = left
        self.right = right
        
class MaximumDepthOfBinaryTree:
    def maximumDepthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        if not root:
            return 0
        
        return 1 + max(self.maximumDepthOfBinaryTree(root.left), self.maximumDepthOfBinaryTree(root.right))
    
    
if __name__ == "__main__":
    solution = MaximumDepthOfBinaryTree()
    
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(6)
    root.left.left.left = TreeNode(7)
    root.right.right.left = TreeNode(8)
    root.right.right.right = TreeNode(9)
    root.right.right.left.right = TreeNode(10)
    
    print(solution.maximumDepthOfBinaryTree(root))