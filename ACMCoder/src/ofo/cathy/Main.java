package ofo.cathy;

/**
 * Created by Han on 2017/09/28.
 */


public class Main {
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        char  elem;

        public TreeNode() {
        }
    }

    public static TreeNode BinaryTreeFromOrderings(String inorder, String preorder, int length)
    {
        if(length == 0)
        {
            return null;
        }
        TreeNode node = new TreeNode();//Noice that [new] should be written out.
        node.elem = preorder.charAt(0);
        int rootIndex = 0;
        for(;rootIndex < length; rootIndex++)//a variation of the loop
        {
            if(inorder.charAt(rootIndex) == preorder.charAt(0))
            break;
        }
        node.left = BinaryTreeFromOrderings(inorder, preorder +1, rootIndex);
        node.right = BinaryTreeFromOrderings(inorder + rootIndex + 1, preorder + rootIndex + 1, length - (rootIndex + 1));
        System.out.println(node.elem);
        return node;
    }

    public static void main(String[] args) {

        String pr="GDAFEMHZ";
        String in="ADEFGHMZ";
        BinaryTreeFromOrderings(in, pr, 8);
        System.out.println();
    }

}
