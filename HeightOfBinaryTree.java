package recursion;

public class HeightOfBinaryTree {

	Node root;
	public static void main(String[] args) {
		HeightOfBinaryTree tree=new HeightOfBinaryTree();
		tree.root=new Node(1);
//		tree.root.left=new Node(2);
//		tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
        System.out.println(tree.height(tree.root));
	}
	
	 int height(Node node) {
		if(node==null) {
			return -1;
		}
		
		else {
			int leftHeight=height(node.left);
			int rightHeight=height(node.right);
			if(leftHeight>rightHeight) {
				return leftHeight+1;
			}
			else return rightHeight+1;
		}
	}
}
	
	class Node {
		int data;
		Node left,right;
		
		Node(int value){
			data=value;
			left=right=null;
		}
	}

