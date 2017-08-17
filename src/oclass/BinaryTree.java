package oclass;


public class BinaryTree {
	public Node root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void insert(Node start, int n) {
		if(start == null) {
			if (root == null) {
				Node creation = new Node(n);
				root = creation;
				return;
			}
			Node creation = new Node(n);
			start = creation;
			return;
			
		}
		
		if (start.getData() < n) {
			if (start.getRight() == null) {
				Node creation = new Node(n);
				start.setRight(creation);
				return;
			}
			start = start.getRight();
			insert(start, n);
		} else if (start.getData() > n) {
			if (start.getLeft() == null) {
				Node creation = new Node(n);
				start.setLeft(creation);
			}
			start = start.getLeft();
			insert(start, n);
		}
		
	}

	public boolean find(Node start, int n) {
		
		if (start == null) {
			return false;
		}
		if (start.getData() == n) {
			return true;
		}
		if (start.getData() > n) {
				start = start.getLeft();
				return find(start, n);
		} else {
			start = start.getRight();
			return find(start, n);		
		} 

		
	}
	
	public Node getNode(Node start, int n) {
		if (start == null) {
			//only if there is nothing to return
			return root;
		}
		if (start.getData() == n) {
			return start;
		}
		if (start.getData() > n) {
				start = start.getLeft();
				return getNode(start, n);
		} else {
			start = start.getRight();
			return getNode(start, n);		
		} 
 
	}

	public void display(Node n) {
		if (n != null) {
			display(n.getLeft());
			System.out.print(n.getData() + " ");
			display(n.getRight());
		}
	}	
	
	public void delete(int n) {
		// start with root
		if (this.root == null) return;
		deleteInternal(null, this.root, n);
	}
	
	private void deleteInternal(Node parent, Node node, int n) {
		// case 1: when it is bigger than node.getData()
		if (n > node.getData()) { 
			if (node.getRight() == null) {
				System.out.println("nothing to delete");
			} else {
				deleteInternal(node, node.getRight(), n);
			}
		} 
		
		// when it is smaller than node.getData()
		if (n < node.getData()) { 
			if (node.getLeft() == null) {
				System.out.println("nothing to delete");
			} else {
				deleteInternal(node, node.getLeft(), n);
			}
		} 
		
		//  case 2: when it is equal
		if (n == node.getData()){ 
			// when it has no child, then just delete the node reference from parent
			if (node.getLeft() == null && node.getRight() == null) {
				if (parent == null) { // it is root, so just no more items
					this.root = null;
				} else if (parent.getLeft() == node) {
					parent.setLeft(null);
				} else {
					parent.setRight(null);
				}
			}
			// when it has one child, replace self with child
			else if(node.getLeft() == null ^ node.getRight() == null) {
				// get the child node
				Node child = node.getLeft() != null ? node.getLeft() : node.getRight();
				
				// assign child to parent
				if(parent == null) { // it is root
					this.root = child;
				} else { // non-root, replace the node with its child
					if(node == parent.getRight()) {
						parent.setRight(child);
					} else {
						parent.setLeft(child);
					}
				}
			}
			
			// case 3: when it has two children, replace node with smallest from right side
			else {
				// find the smallest from right side
				Node smallestInRight = removeSmallest(node, node.getRight());
				
				// set left and right
				smallestInRight.setLeft(node.getLeft());
				smallestInRight.setRight(node.getRight());
				
				// make current node's parent point to the new node
				// assign child to parent
				if(parent == null) { // it is root
					this.root = smallestInRight;
				} else { // non-root, replace the node with its child
					if(node == parent.getRight()) {
						parent.setRight(smallestInRight);
					} else {
						parent.setLeft(smallestInRight);
					}
				}
			}
		}
	}
	
	private Node removeSmallest(Node parent, Node node) {
		//if node has no child
		if (node.getLeft() == null && node.getRight() == null) {
			if (parent.getLeft() == node) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
			return node;
		} 
	
		else {
			//check the left side
			if(node.getLeft() == null) {
				if (parent.getLeft() == node) {
					parent.setLeft(node.getRight());
				} else {
					parent.setRight(node.getRight());
				}
				return node;
			} else {
				 return removeSmallest(node, node.getLeft());
			}
		}
	}
	
	public void deleteOld(int n) {
		if (!find(root, n)) return;
	
		Node found = getNode(root, n);
		Node start = root;

		
		//check if it has no root and if does not set it to null. change parent setting
		if (found.getLeft() == null && found.getRight() == null) {
			if (root == found) {
				root = null;
			} else {
				boolean x = true;
				while(x) {
					//check the right side
					if (n > start.getData()) {
						if(start.getRight() == found) {
							start.setRight(null);
							x = false;
							continue;
						} 
						start = start.getRight();
						continue;
					}
					//check the left side
					if (n < start.getData()) {
						if(start.getLeft() == found) {
							start.setLeft(null);
							x = false;
							continue;
						}
					}
					start = start.getLeft();
					continue;
				}
			}
		}
		
		
	
		
		//if it has one child replace set you to child, also change parent setting
		if (found.getLeft() == null ^ found.getRight() == null) {
				//check if found element is the first one
				if (root == found) {
					if (root.getRight() != null) {
						root = root.getRight();
					} else {
						root = root.getLeft();
					}
				} else {
					boolean x = true;
					while(x) {
						//check the right side of the tree
						if (n > start.getData()) {
							if(start.getRight() == found) {
								//if found check the right side of the found element
								if (start.getRight().getRight() != null) {
									start.setRight(start.getRight().getRight());
									x = false;
									continue;
								}//if not check the left side of the found element
								if (start.getRight().getLeft() != null) {
									start.setRight(start.getRight().getLeft());
									x = false;
									continue;
								}
							} 
							start = start.getRight();
							continue;
						}
						//check the left side of the tree
						if (n < start.getData()) {
							if(start.getLeft() == found) {
								//if found check the right side of the found element
								if (start.getLeft().getRight() != null) {
									start.setLeft(start.getLeft().getRight());
									x = false;
									continue;
								}//if found check the left side of the found element
								if (start.getLeft().getLeft() != null) {
									start.setLeft(start.getRight().getLeft());
									x = false;
									continue;
								}

							}
						}
						start = start.getLeft();
						continue;
					}
			}
		}
		
		
		
		
		//restructure based on the kids from smallest to biggest and add one at a time
		if (found.getLeft() != null && found.getRight() != null) {
			//always have the found node and the start at the root
			Node parent = start;
			Node foundls = found.getLeft();
			Node replacementparent = null;
			Node replacementright = null;
			Node replacement = found;
			//check if right side has any child
			//make a three case scenario
			if (found.getRight().getLeft() != null || found.getRight().getRight() != null) { //it has two childs
				replacementparent = found.getRight();
				replacement = found.getRight();
				while(replacement.getLeft() != null) replacement = replacement.getLeft(); //find replacement
				if(replacement.getRight() != null) replacementright = replacement.getRight(); //get potential right node if there
				while(replacementparent.getLeft() != replacement) replacementparent = replacementparent.getLeft(); //set the replacementparent
				replacementparent.setLeft(replacementright);
				replacement.setLeft(foundls);
				replacement.setRight(found.getRight());
				while(parent.getLeft() != found && parent.getRight() != found) {
					if(found.getData() > parent.getData()) {
						parent = parent.getRight();
					} else if(found.getData() < parent.getData()) {
						parent = parent.getLeft();
					} 
				}
				if(parent == root) { // account for the root case
					if(parent == found) { //check if root is deleted
						replacement.setLeft(root.getLeft());
						replacement.setRight(root.getRight());
						root = replacement;
					} else {
						if (found.getData() > parent.getData()) { //check if it is on left or right side
							parent.setRight(replacement);
						} else {
							parent.setLeft(replacement);
						}
					}
				} else {
					parent.setRight(replacement); // not part of the root
				}
				
			} else {//no other child
				System.out.println();
			}
			
		}	

				
	}

				
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
	
		b.insert(b.root, 10);
		b.insert(b.root, 15);
		b.insert(b.root, 18);
		b.insert(b.root, 5);
		b.insert(b.root, 2);
		b.insert(b.root, 7);
		b.insert(b.root, 6);
		b.insert(b.root, 16);
		b.insert(b.root, 20);
		//b.insert(b.root, 19);
		b.insert(b.root, 21);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		//System.out.println("Check whether Node with value 4 exists : " + b.find(b.root, 4));
		
		//System.out.println("Delete Node with no children (2) : ");
		//b.delete(2);
		//b.display(b.root);
		//System.out.println("\n Delete Node with one child (4) : ");		
		//b.delete(4);
		//b.display(b.root);
		//System.out.println("\n Delete Node with Two children (10) : ");		
		System.out.println("Updated List");
		b.delete(18);
		b.display(b.root);
	}

}
