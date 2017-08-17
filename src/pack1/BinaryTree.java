package pack1;

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
			//add the right side into the deleted node, then insert the left element of the deleted node
				//check if the root is the element removed
				Node successor = null;
				Node parent = root;
				Node leftadd = null;
				
				if (root == found) {
					
					leftadd = root.getLeft();
					root = root.getRight();
					start = root;
					boolean x = true;
					while(x) {
						if (start.getLeft() != null) {
							start = start.getLeft();
							continue;
						} else {
							start.setLeft(leftadd);
							x = false;
						}
					}
					
				
				} else {
					boolean x = true;
					while(x) {
						//test the right side
						if (n > start.getData()) {
							if (start.getRight() == found) {
								leftadd = start.getRight().getLeft();
								start.setRight(start.getRight().getRight());
								start = start.getRight();
								while(x) {
									if (start.getLeft() != null) {
										start = start.getLeft();
										continue;
									} else {
										start.setLeft(leftadd);
										x = false;
										continue;
									}
								}
							}
							start = start.getRight();
							continue;
						}
						//test the left side
						if (n < start.getData()) {
							if (start.getLeft() == found) {
								leftadd = start.getLeft().getLeft();
								start.setLeft(start.getLeft().getRight());
								start = start.getLeft();
								while(x) {
									if (start.getLeft()!= null) {
										start = start.getLeft();
										continue;
									} else {
										start.setLeft(leftadd);
										x = false;
										continue;
									}
								}
							}
						}	
					}	
				}
				
		}
	}
		
			

	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
	
		b.insert(b.root, 3);
		b.insert(b.root, 8);
		b.insert(b.root, 1);
		b.insert(b.root, 4);
		b.insert(b.root, 6);
		b.insert(b.root, 2);
		b.insert(b.root, 10);
		b.insert(b.root, 9);
		b.insert(b.root, 20);
		b.insert(b.root, 25);
		b.insert(b.root, 15);
		b.insert(b.root, 16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(b.root, 4));
		System.out.println("Delete Node with no children (2) : ");
		b.delete(2);
		b.display(b.root);
		System.out.println("\n Delete Node with one child (4) : ");		
		b.delete(4);
		b.display(b.root);
		System.out.println("\n Delete Node with Two children (10) : ");		
		b.delete(10);
		b.display(b.root);
	}

}
