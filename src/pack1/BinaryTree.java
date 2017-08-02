package pack1;

public class BinaryTree {
	public static Node root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void insert(int n) {
		Node nadd = new Node(n);
		if(root == null) {
			root = nadd;
			return;
		} else if (n > root.getData()) {
			root = root.getRight();
			insert(n);
		} else {
			root = root.getLeft();
			insert(n);
		}

	}

	public boolean find(int n) {
		if (root != null) {
			if (root.getData() == n) {
				return true;
			} else if (root.getData() > n) {
				root = root.getLeft();
				find(n);

			} else if (root.getData() < n) {
				root = root.getRight();
				find(n);
			}
		}
		return false;
	}

	public void display(Node n) {
		if (root != null) {
			display(n.getLeft());
			System.out.print(n + " ");
			display(n.getRight());
		}
	}
	
	//public void delete(int n) {

	//}
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		//System.out.println("Delete Node with no children (2) : " + b.delete(2));		
		b.display(root);
		//System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
		b.display(root);
		//System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
		b.display(root);
	}

}
