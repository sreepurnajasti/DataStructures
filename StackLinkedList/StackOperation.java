/**
 *
 * @author SreePurna
 */
class StackOperation{
	Node head;
	
	/**
	 *
	 * This method is used to insert data on stack.
	 * @param data: It is an integer value which is to be inserted on stack.
	 */
	public void push(int data){
		if(head==null){
			head= new Node();
			head.data= data;
		}else{
			Node currentNode= new Node();
			currentNode.data= data;
			currentNode.next= head;
			head= currentNode;
		}
	}

	/**
	 *
	 * This method is used to remove & display the last element inserted in the stack.
	 */
	public void pop(){
		if(head!=null){
			Node currentNode= head;
			head= head.next;
			System.out.println("POP: Last element inserted in the stack is: "+currentNode.data);
		}else{
			System.out.println("Underflow: Stack is empty");
		}
	}
	
	/**
	 *
     * This method is used to display last element inserted in the stack.
	 */
	public void top(){
		if(head!=null){
			System.out.println("TOP: Last element inserted in the stack is: "+head.data);
		}else{
			System.out.println("Stack is empty");
		}
	}
	
	/**
	 *
     * This method is used to display the number of elements stored in the stack.
	 */
	public void size(){
		int count=0;
		Node currentNode= head;
		while(currentNode!=null){
			count++;
			currentNode= currentNode.next;
		}
		System.out.println("Number of elements in the stack is: "+count);
	}
	
	/**
	 *
     * This method is used to indicated whether the stack is empty or not.
	 */
	public boolean isEmptyStack(){
		if(head==null){
			return true;
		}else{
			return false;
		}
	}
}